package com.project.security;

import com.project.domain.Client;
import com.project.domain.Role;
import com.project.exposition.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClientDtoHashService {

 //   @Autowired
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    private ClientDto clientDto;

    public ClientDtoHashService(ClientDto clientDto, PasswordEncoder passwordEncoder){
        this.clientDto = clientDto;
        this.passwordEncoder = passwordEncoder;
    }

    public ClientDtoHashService(){}

    public Client clientDtoHash(ClientDto clientDto) {
        Client client = new Client();
        client.setEmail(clientDto.getEmail());
        client.setPassword(clientDto.getPassword());

//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        client.setPassword(passwordEncoder.encode(clientDto.getPassword()));
        client.setEmail(clientDto.getEmail());
        client.setRoles(new ArrayList<>(Arrays.asList(new Role(1, "USER"))));

        return client;
    }

    public ClientDto getClientDto ( ) {
        return clientDto;
    }

    public void setClientDto (ClientDto clientDto) {
        this.clientDto = clientDto;
    }

}

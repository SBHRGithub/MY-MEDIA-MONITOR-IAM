package com.project.exposition;

import com.project.domain.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ClientDto convertEntityToDto(Client client){
        return new ClientDto(client.getEmail(),client.getPassword());
    }

    public Client convertDtoToEntity(ClientDto clientDto){
        Client client = new Client();
        client.setEmail(clientDto.getEmail());
        client.setPassword(clientDto.getPassword());

        return client;
    }

    public ClientDtoRegisterResponse convertDtoToDtoResponse(ClientDto clientDto){
        ClientDtoRegisterResponse clientDtoRegisterResponse = new ClientDtoRegisterResponse();
        clientDtoRegisterResponse.setEmail(clientDto.getEmail());

        return clientDtoRegisterResponse;
    }

}

package com.project.exposition;

import com.project.domain.Client;
import com.project.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@EnableWebSecurity
public class ClientController {

    @Autowired
    IClientService service;

    @Autowired
    ClientMapper mapper;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/register")
    public ResponseEntity<ClientDto> registerClient(@RequestBody ClientDto clientDto) {
 //       Client client = mapper.convertDtoToEntity(clientDto);
 //       ClientDto dto =mapper.convertEntityToDto(service.registerClient(client));
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.convertEntityToDto(service.registerClient(mapper.convertDtoToEntity(clientDto))));
 //       return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
}



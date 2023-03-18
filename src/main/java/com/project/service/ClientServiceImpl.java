package com.project.service;

import com.project.domain.Client;
import com.project.exposition.ClientMapper;
import com.project.infrastructure.IClientRepository;
import com.project.security.ClientDtoHashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    IClientRepository repository;

    @Autowired
    ClientMapper mapper;

    public Client findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public Client registerClient(Client client) {
        return repository.save(new ClientDtoHashService().clientDtoHash(mapper.convertEntityToDto(client)));
    }
}

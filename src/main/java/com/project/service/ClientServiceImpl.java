package com.project.service;

import com.project.domain.Client;
import com.project.infrastructure.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    IClientRepository repository;

    public Client findByEmail(String email) {
        return repository.findByEmail(email);
    }


}

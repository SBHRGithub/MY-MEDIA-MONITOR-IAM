package com.project.service;

import com.project.domain.Client;

public interface IClientService {

    Client findByEmail(String email);

    Client registerClient(Client client);


}

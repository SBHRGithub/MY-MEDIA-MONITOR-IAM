package com.project.infrastructure;

import com.project.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<Client,String> {

    Client findByEmail(String email);

}

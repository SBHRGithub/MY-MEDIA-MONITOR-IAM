package com.project.security;

import com.project.domain.Client;
import com.project.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    IClientService clientService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Client client=clientService.findByEmail(email);

        List<GrantedAuthority> auth=new ArrayList<>();

        client.getRoles().forEach(role->{
            GrantedAuthority ga=new SimpleGrantedAuthority(role.getName());
            auth.add(ga);
        });
        return new User(client.getEmail(),client.getPassword(), auth);
    }
}

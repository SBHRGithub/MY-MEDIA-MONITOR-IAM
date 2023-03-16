package com.project.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @Column(unique = true)
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

    public Client(String email, List<Role> roles) {
        this.email = email;
        this.roles = roles;
    }

    public Client() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


}

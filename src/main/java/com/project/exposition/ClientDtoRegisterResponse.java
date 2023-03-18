package com.project.exposition;

public class ClientDtoRegisterResponse {

    private String email;

    public ClientDtoRegisterResponse(String email) {
        this.email = email;
    }

    public ClientDtoRegisterResponse(){}

    public String getEmail ( ) {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }
}

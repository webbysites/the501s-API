package com.the501s.the501s.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("request-contact")
public class RequestContact {

    @Id
    private String id;
    private String name;
    private String email;
    private String request;


    public RequestContact() {
    }

    public RequestContact(String id, String name, String email, String request) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.request = request;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", request='" + getRequest() + "'" +
            "}";
    }

}
package com.the501s.the501s.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vote-contact")
public class VoteContact {

    @Id
    private String id;
    private String name;
    private String email;
    private String comment;

    public VoteContact() {
    }


    public VoteContact(String id, String name, String email, String comment) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.comment = comment;
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

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", comment= '" + getComment() + "'" +
            "}";
    }
    

}
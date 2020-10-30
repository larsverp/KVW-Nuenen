package com.example.KVWNuenen.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Parent {

    @Id
    private UUID id;
    private String first_name;
    private String insertion;
    private String last_name;

    public Parent(UUID id, String first_name, String insertion, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.insertion = insertion;
        this.last_name = last_name;
    }

    public Parent(){

    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getInsertion() {
        return insertion;
    }

    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}

package com.feszer.backend.model;


import jakarta.persistence.Entity;

@Entity
public class Service extends Product{

    public Service(String name, String description) {
        super(name, description);
    }
}

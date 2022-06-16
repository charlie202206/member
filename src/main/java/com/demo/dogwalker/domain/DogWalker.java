package com.demo.dogwalker.domain;

import javax.persistence.*;

@Entity
public class DogWalker {

    @Id @GeneratedValue
    Long id;
    
    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    DogWalkerStatus status;

    public DogWalkerStatus getStatus() {
        return status;
    }

    public void setStatus(DogWalkerStatus status) {
        this.status = status;
    }

    
}

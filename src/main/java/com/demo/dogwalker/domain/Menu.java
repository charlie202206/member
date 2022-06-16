package com.demo.dogwalker.domain;

import javax.persistence.*;

@Entity
public class Menu {
    @Id @GeneratedValue
    Long id;
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

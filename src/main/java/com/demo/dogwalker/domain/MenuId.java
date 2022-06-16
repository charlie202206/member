package com.demo.dogwalker.domain;

import javax.persistence.Embeddable;

@Embeddable
public class MenuId {
    String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}

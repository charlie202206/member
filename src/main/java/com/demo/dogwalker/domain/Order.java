package com.demo.dogwalker.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Order {

    @Id @GeneratedValue
    Long id;

    @OneToMany
    List<Menu> menus;

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
    
}

package com.demo.dogwalker.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="order_table")

public class Order {

    @Id @GeneratedValue
    Long id;

    String comment;
    

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @ElementCollection
    List<MenuId> menuIds;
    

    public List<MenuId> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<MenuId> menuIds) {
        this.menuIds = menuIds;
    }

    @ManyToMany
    List<Menu> menus;

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    @ElementCollection
    // @OneToMany
    List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    
    @OneToMany
    List<OrderItemEntity> orderItemEntities;


    public List<OrderItemEntity> getOrderItemEntities() {
        return orderItemEntities;
    }

    public void setOrderItemEntities(List<OrderItemEntity> orderItemEntities) {
        this.orderItemEntities = orderItemEntities;
    }

    
}

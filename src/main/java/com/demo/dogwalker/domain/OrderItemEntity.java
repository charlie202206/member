package com.demo.dogwalker.domain;

import javax.persistence.*;

@Entity
public class OrderItemEntity {

    @Id @GeneratedValue
    Long id;

    String menuId;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    int qty;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    

    @ManyToOne
    Order order;
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}

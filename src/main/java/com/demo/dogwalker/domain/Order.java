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

    ////// Lifecycle 을 Order 와 같이 하는 경우 (Composition)
    @Embedded  // 1:1
    @AttributeOverride(name="id", column=@Column(name="menuId")) //embed 하면서 order.id 와 menuId.id가 겹치므로 회피해주는 
    MenuId oneMenu;  

        public MenuId getOneMenu() {
            return oneMenu;
        }

        public void setOneMenu(MenuId oneMenu) {
            this.oneMenu = oneMenu;
        }

    @ElementCollection // 1:n
    List<MenuId> menuIds;
        

        public List<MenuId> getMenuIds() {
            return menuIds;
        }

        public void setMenuIds(List<MenuId> menuIds) {
            this.menuIds = menuIds;
        }

    @ElementCollection  // 1:n
    List<OrderItem> orderItems;
    
        public List<OrderItem> getOrderItems() {
            return orderItems;
        }
    
        public void setOrderItems(List<OrderItem> orderItems) {
            this.orderItems = orderItems;
        }
    
    

    //// Lifecycle 를 같이 하지 않는 경우 (별도 저장/수정 될 수 있는 경우 --> Aggregation)
        // 이 경우, 각자의 Repository 가 필요함. 


    @OneToOne
    OrderItemEntity orderItemEntity;
        public OrderItemEntity getOrderItemEntity() {
            return orderItemEntity;
        }
        public void setOrderItemEntity(OrderItemEntity orderItemEntity) {
            this.orderItemEntity = orderItemEntity;
        }

    @ManyToMany   // @OneToMany  // @OneToOne
    List<Menu> menus;
        public List<Menu> getMenus() {
            return menus;
        }
        public void setMenus(List<Menu> menus) {
            this.menus = menus;
        }
    
    @OneToMany(
        mappedBy = "order"  //mappedBy 가 있으면 테이블이 그냥 2개 생성 (Order, OrderItemEntity) 없으면 중간 매핑 테이블이 하나 더 생겨서 3개가 생성(Order, OrderItemEntity, Order_OrderItemEntity)
    )
    List<OrderItemEntity> orderItemEntities;
        public List<OrderItemEntity> getOrderItemEntities() {
            return orderItemEntities;
        }

        public void setOrderItemEntities(List<OrderItemEntity> orderItemEntities) {
            this.orderItemEntities = orderItemEntities;
        }

    
}

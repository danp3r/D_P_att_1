package org.example;

import java.util.List;

public class User {
    private Long userId;
    private String fio;
    private String mail;
    private List<Order> orders;
    private Long shopId;

    public User() {
    }

    public User(Long userId, String fio, String mail, List<Order> orders, Long shopId) {
        this.userId = userId;
        this.fio = fio;
        this.mail = mail;
        this.orders = orders;
        this.shopId = shopId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getFio() {
        return fio;
    }

    public String getMail() {
        return mail;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Long getShopId() {
        return shopId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fio='" + fio + '\'' +
                ", mail='" + mail + '\'' +
                ", orders=" + orders +
                ", shopId=" + shopId +
                '}';
    }
}

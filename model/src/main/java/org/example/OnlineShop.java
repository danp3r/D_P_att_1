package org.example;

import java.util.List;

public class OnlineShop {

    private Long shopId;
    private String shopName;

    private List<PointOfIssue> pointOfIssues;
    private List<User> users;

    public OnlineShop() {
    }

    public OnlineShop(Long shopId, String shopName, List<PointOfIssue> pointOfIssues, List<User> users) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.pointOfIssues = pointOfIssues;
        this.users = users;
    }

    public Long getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public List<PointOfIssue> getPointOfIssues() {
        return pointOfIssues;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "OnlineShop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", pointOfIssues=" + pointOfIssues +
                ", users=" + users +
                '}';
    }
}

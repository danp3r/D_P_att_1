package org.example;

public class Order {
    private Long orderId;
    private String postalCode;
    private Long userId;
    private Long shopId;

    public Order() {
    }

    public Order(Long orderId, String postalCode, Long userId, Long shopId) {
        this.orderId = orderId;
        this.postalCode = postalCode;
        this.userId = userId;
        this.shopId = shopId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getShopId() {
        return shopId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", postalCode='" + postalCode + '\'' +
                ", userId=" + userId +
                ", shopId=" + shopId +
                '}';
    }
}

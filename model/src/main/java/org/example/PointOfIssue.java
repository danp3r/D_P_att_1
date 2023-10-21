package org.example;

public class PointOfIssue {
    private Long pointId;
    private Location location;
    private int capacity;
    private int countEmployees;
    private Long shopId;

    public PointOfIssue() {
    }

    public PointOfIssue(Long pointId, Location location, int capacity, int countEmployees, Long shopId) {
        this.pointId = pointId;
        this.location = location;
        this.capacity = capacity;
        this.countEmployees = countEmployees;
        this.shopId = shopId;
    }

    public Long getPointId() {
        return pointId;
    }

    public Location getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountEmployees() {
        return countEmployees;
    }

    public Long getShopId() {
        return shopId;
    }

    @Override
    public String toString() {
        return "PointOfIssue{" +
                "pointId=" + pointId +
                ", location=" + location +
                ", capacity=" + capacity +
                ", countEmployees=" + countEmployees +
                ", shopId=" + shopId +
                '}';
    }
}

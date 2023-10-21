package org.example;

public class Location {
    private Long locationId;
    private String address;
    private Long pointId;

    public Location() {
    }

    public Location(Long locationId, String address, Long pointId) {
        this.locationId = locationId;
        this.address = address;
        this.pointId = pointId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public String getAddress() {
        return address;
    }

    public Long getPointId() {
        return pointId;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", address='" + address + '\'' +
                ", pointId=" + pointId +
                '}';
    }
}

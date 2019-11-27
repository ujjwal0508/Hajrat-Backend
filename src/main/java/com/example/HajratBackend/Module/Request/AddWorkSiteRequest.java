package com.example.HajratBackend.Module.Request;

public class AddWorkSiteRequest {

    private String name;
    private String description;
    private Double longitude;
    private String address;
    private Double latitude;
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public AddWorkSiteRequest(String name, String description, Double longitude, String address, Double latitude, String imageUrl) {
        this.name = name;
        this.description = description;
        this.longitude = longitude;
        this.address = address;
        this.latitude = latitude;
        this.imageUrl = imageUrl;
    }
}

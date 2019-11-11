package com.example.HajratBackend.Module;

public class AddWorkSiteRequeat {

    String name;
    String Description;
    Double longitude;
    String address;
    Double latitude;
    String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
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

    public AddWorkSiteRequeat(String name, String description, Double longitude, String address, Double latitude, String imageUrl) {
        this.name = name;
        Description = description;
        this.longitude = longitude;
        this.address = address;
        this.latitude = latitude;
        this.imageUrl = imageUrl;
    }
}

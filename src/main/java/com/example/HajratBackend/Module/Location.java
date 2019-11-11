package com.example.HajratBackend.Module;

public class Location{

    Double longitude;
    String address;
    Double latitude;

    public Location(Double longitude, String address, Double latitude) {
        this.longitude = longitude;
        this.address = address;
        this.latitude = latitude;
    }

    public Location(String address, Double latitude, Double longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(String address) {
        this.address = address;
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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }


}

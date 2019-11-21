package com.example.HajratBackend.Module;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "location")
public class Location{

    @SequenceGenerator(name="seq", initialValue=1000, allocationSize=10)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Long id;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "address")
    @NotNull
    private String address;

    @Column(name = "latitude")
    private Double latitude;

    @OneToOne(mappedBy = "location")
    private WorkSite workSite;

    public Location(Long id, Double longitude, String address, Double latitude) {
        this.id = id;
        this.longitude = longitude;
        this.address = address;
        this.latitude = latitude;
    }

    public Location(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

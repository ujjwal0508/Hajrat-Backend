package com.example.HajratBackend.Module;

import java.util.UUID;

public class WorkSite {

    UUID id;
    String name;
    String Description;
    String imageUrl;
    Location Location;

    public WorkSite(UUID id, String name, String description, Location location) {
        this.id = id;
        this.name = name;
        Description = description;
        Location = location;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location location) {
        Location = location;
    }


}



package com.example.HajratBackend.Controller;

import com.example.HajratBackend.Module.Location;
import com.example.HajratBackend.Module.Request.AddUserRequest;
import com.example.HajratBackend.Module.Request.AddWorkSiteRequest;
import com.example.HajratBackend.Module.WorkSite;
import com.example.HajratBackend.Repository.LocationRepository;
import com.example.HajratBackend.Repository.WorkSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PopulateController {

    @Autowired
    private WorkSiteRepository workSiteRepository;

    @Autowired
    private LocationRepository locationRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/addAdmin/")
    public void addAdmin(@RequestBody AddUserRequest request)throws Exception{

//        User user = new User(UUID.randomUUID(), request.getName(), User.UserType.ADMIN, request.getPhoneNo());
        //add to database

    }


    @RequestMapping(method = RequestMethod.POST, value = "/addWorker/")
    public void addWorker(@RequestBody AddUserRequest request)throws Exception{

//        User user = new User(UUID.randomUUID(), request.getName(), User.UserType.WORKER, request.getPhoneNo());
        //add to database

    }

    @RequestMapping(value = "/addWorkSite", method = RequestMethod.POST)
    public void addWorkSite(@RequestBody AddWorkSiteRequest request) throws Exception {

        System.out.println("ujjwal 0");

        Location location = new Location(request.getAddress(), request.getLatitude(), request.getLongitude());

        System.out.println("ujjwal -1");
//        locationRepository.save(location);

        WorkSite workSite = new WorkSite(request.getName(), request.getDescription(), request.getImageUrl());
        workSite.setLocation(location);
        location.setWorkSite(workSite);
        workSiteRepository.save(workSite);

    }

    
}

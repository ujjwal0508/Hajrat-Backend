package com.example.HajratBackend.Controller;

import com.example.HajratBackend.Module.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PopulateController {

    @RequestMapping(method = RequestMethod.POST, value = "/addAdmin/")
    public void addAdmin(@RequestBody AddUserRequest request)throws Exception{

        User user = new User(UUID.randomUUID(), request.getName(), User.UserType.ADMIN, request.getPhoneNo());
        //add to database

    }


    @RequestMapping(method = RequestMethod.POST, value = "/addWorker/")
    public void addWorker(@RequestBody AddUserRequest request)throws Exception{

        User user = new User(UUID.randomUUID(), request.getName(), User.UserType.WORKER, request.getPhoneNo());
        //add to database

    }

    public void addWorkSite(@RequestBody AddWorkSiteRequeat request) throws Exception {

        Location location = new Location(request.getAddress(),request.getLatitude(),request.getLongitude());

        WorkSite workSite = new WorkSite(UUID.randomUUID(),request.getName(),request.getDescription(),location);

        //add to database
    }

    
}

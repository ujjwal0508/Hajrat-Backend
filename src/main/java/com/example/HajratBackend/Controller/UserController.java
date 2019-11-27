package com.example.HajratBackend.Controller;

import com.example.HajratBackend.Module.Response.AllWorkSiteList;
import com.example.HajratBackend.Module.WorkSite;
import com.example.HajratBackend.Repository.WorkSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private WorkSiteRepository workSiteRepository;

    @RequestMapping(value = "/allWorksites", method = RequestMethod.GET)
    public AllWorkSiteList getAllWorkSites(){

        List<WorkSite> workSiteList = new ArrayList<>();
        Iterable<WorkSite> allWorkSitesIterable = workSiteRepository.findAll();
        allWorkSitesIterable.forEach(workSiteList::add);

        return new AllWorkSiteList(workSiteList);
    }
}

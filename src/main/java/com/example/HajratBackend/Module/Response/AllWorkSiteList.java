package com.example.HajratBackend.Module.Response;

import com.example.HajratBackend.Module.WorkSite;

import java.util.List;

public class AllWorkSiteList {

    private List<WorkSite> workSites;

    public AllWorkSiteList(List<WorkSite> workSites) {
        this.workSites = workSites;
    }

    public List<WorkSite> getWorkSites() {
        return workSites;
    }

    public void setWorkSites(List<WorkSite> workSites) {
        this.workSites = workSites;
    }
}

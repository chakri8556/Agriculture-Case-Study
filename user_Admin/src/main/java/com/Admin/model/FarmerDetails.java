package com.Admin.model;

import java.util.List;

public class FarmerDetails {
    private List<Farmer> userFarmer;

    public List<Farmer> getUserFarmer(){
        return userFarmer;

    }
    public void setUserFarmer(List<Farmer> userFarmer){
        this.userFarmer = userFarmer;
    }
}
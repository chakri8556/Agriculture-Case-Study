package com.Admin.model;

import java.util.List;

public class CropDetails {
    private List<Crop> userCrop;

    public List<Crop> getUserCrop(){
        return userCrop;
    }

    public void setUserCrop(List<Crop> userCrop) {
        this.userCrop = userCrop;
    }
}


package com.Admin.model;

import java.util.List;

public class DealerDetails {
    private List<Dealer> userDealer;

    public List<Dealer> getUserDealer(){
        return userDealer;
    }

    public void setUserDealer(List<Dealer> userDealer) {
        this.userDealer = userDealer;
    }
}

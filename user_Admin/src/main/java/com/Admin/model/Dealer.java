package com.Admin.model;


public class Dealer {

        private int dealerid;
        private String dealername;
        private long phoneno;
        private String dealermailid;
    public Dealer() { }
    public int getDealerid() {
        return dealerid;
    }

    public void setDealerid(int dealerid) {
        this.dealerid = dealerid;
    }

    public String getDealername() {
        return dealername;
    }

    public void setDealername(String dealername) {
        this.dealername = dealername;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public String getDealermailid() {
        return dealermailid;
    }

    public void setDealermailid(String dealermailid) {
        this.dealermailid = dealermailid;
    }
        public Dealer(int dealerid, String dealername, long phoneno, String dealermailid) {
            this.dealerid = dealerid;
            this.dealername = dealername;
            this.phoneno = phoneno;
            this.dealermailid = dealermailid;
        }

    @Override
    public String toString() {
        return "Dealer{" +
                "dealerid=" + dealerid +
                ", dealername='" + dealername + '\'' +
                ", phoneno=" + phoneno +
                ", dealermailid='" + dealermailid + '\'' +
                '}';
    }
}




package com.Admin.model;



public class Farmer {

    private int farmerid;
    private String farmername;
    private long phoneno;
    private String farmermailid;
    private String farmerlocation;
    public Farmer(){ }


    public Farmer(int farmerid, String farmername, long phoneno, String farmermailid, String farmerlocation) {
        this.farmerid = farmerid;
        this.farmername = farmername;
        this.phoneno = phoneno;
        this.farmermailid = farmermailid;
        this.farmerlocation = farmerlocation;
    }

    public int getFarmerid() {
        return farmerid;
    }

    public void setFarmerid(int farmerid) {
        this.farmerid = farmerid;
    }

    public String getFarmername() {
        return farmername;
    }

    public void setFarmername(String farmername) {
        this.farmername = farmername;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public String getFarmermailid() {
        return farmermailid;
    }

    public void setFarmermailid(String farmermailid) {
        this.farmermailid = farmermailid;
    }

    public String getFarmerlocation() {
        return farmerlocation;
    }

    public void setFarmerlocation(String farmerlocation) {
        this.farmerlocation = farmerlocation;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "farmerid=" + farmerid +
                ", farmername='" + farmername + '\'' +
                ", phoneno=" + phoneno +
                ", farmermailid='" + farmermailid + '\'' +
                ", farmerlocation='" + farmerlocation + '\'' +
                '}';
    }
}




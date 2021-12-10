package com.Admin.model;

public class Crop {
    private int cropid;
    private String cropname;
    private double cropprice;
    private double quantity;
    public Crop() { }
    public Crop(int cropid, String cropname, double cropprice, double quantity) {
        this.cropid = cropid;
        this.cropname = cropname;
        this.cropprice = cropprice;
        this.quantity = quantity;
    }
    public int getCropid() {
        return cropid;
    }

    public void setCropid(int cropid) {
        this.cropid = cropid;
    }

    public String getCropname() {
        return cropname;
    }

    public void setCropname(String cropname) {
        this.cropname = cropname;
    }

    public double getCropprice() {
        return cropprice;
    }

    public void setCropprice(double cropprice) {
        this.cropprice = cropprice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "cropid=" + cropid +
                ", cropname='" + cropname + '\'' +
                ", cropprice=" + cropprice +
                ", quantity=" + quantity +
                '}';
    }
}


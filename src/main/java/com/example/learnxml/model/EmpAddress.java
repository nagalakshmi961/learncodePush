package com.example.learnxml.model;

public class EmpAddress {
    int Housenum;
    String colony;
    Double pincode;

    public int getHousenum() {
        return Housenum;
    }

    public void setHousenum(int housenum) {
        Housenum = housenum;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public Double getPincode() {
        return pincode;
    }

    public void setPincode(Double pincode) {
        this.pincode = pincode;
    }



    public EmpAddress() {
       super();
    }

    public EmpAddress(int housenum, String colony, Double pincode) {
        Housenum = housenum;
        this.colony = colony;
        this.pincode = pincode;
    }
}

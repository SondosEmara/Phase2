package com.example.Phase2.model;


import com.example.Phase2.Service.RideManager;

import java.util.ArrayList;

public class Driver extends User {

    private String drivingLicense;
    private String nationalId;
    private Admin admin;
    private double averageRate=0;
    private  ArrayList<String> favoriteArea=new ArrayList<>();
    private int currentRideId=-1;
    public void setAdmin(Admin admin){this.admin=admin;}

    public void setcurrentRideId(int currentRideId){
        this.currentRideId=currentRideId;
    }
    public int getCurrentRideId() {
        return currentRideId;
    }
    public String getNationalId() {
        return nationalId;
    }

    public String getDriverLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public Admin getAdmin() {
        return admin;
    }

    public double getAverageRate() {

        ArrayList<Ride> rides= RideManager.getRides();

        int counter=0;double rate=0;
        for (Ride ride : rides) {

            if(ride.getDriver()!=null&&ride.getDriver().getUserId()==this.getUserId()){
                rate+=ride.getStar();
                counter++;
            }
        }
        if(counter==0) return 0;
        averageRate=rate/counter;
        System.out.println("AVERAGERATE:"+averageRate);
        return averageRate;
    }
    public void addFavouriteArea(String area){
        favoriteArea.add(area);
    }

    public ArrayList<String>getfavouruteArea(){return favoriteArea;}

}

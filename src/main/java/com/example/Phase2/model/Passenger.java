package com.example.Phase2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passenger extends User {

    public Passenger (@JsonProperty("userName") String userName,
               @JsonProperty("email") String  email,
               @JsonProperty("mobileNum") String  mobileNum,
               @JsonProperty("password") String password){

        this.setUserName(userName);
        this.setEmail(email);
        this.setMobileNum(mobileNum);
        this.setPassword(password);
    }
    public Passenger(){}
    private int currentRideId=-1;
    public Ride rideRequest(String source, String destination) {
        Ride newRide=new Ride();
        newRide.setDestination(destination);
        newRide.setSource(source);
        newRide.setPassenger(this);
        newRide.setStatus("Waiting");
        return newRide;

    }

    public void setcurrentRideId(int currentRideId){this.currentRideId=currentRideId;}
    public int getcurrentRideId(){return currentRideId;}
}

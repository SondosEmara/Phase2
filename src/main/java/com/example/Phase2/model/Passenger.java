package com.example.Phase2.model;

public class Passenger extends User {
    private int currentRideId=-1;
    Ride rideRequest(String source, String destination) {
        Ride newRide=new Ride();
        newRide.setDestination(destination);
        newRide.setSource(source);
        newRide.setPassenger(this);
        newRide.setStatus("Waiting");
        return newRide;

    }

    void setcurrentRideId(int currentRideId){this.currentRideId=currentRideId;}
    int getcurrentRideId(){return currentRideId;}
}

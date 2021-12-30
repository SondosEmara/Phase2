package com.example.Phase2.model;

import java.util.HashMap;
import java.util.Map;

public class Ride {
        private String source ;
        private String destination ;
        private int rideId;
        private Passenger passenger;
        private String rideStatus;
        //int is driverId and the String is Price.
        private Map<Integer, String> rideOffers = new HashMap();
        private Driver driver;
        private int starNum=0;


        public void setStar(int starNum){this.starNum=starNum;}
        public int getStar(){return starNum;}
        public String getSource() {
            return this.source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setDestination(String destination){this.destination=destination;}

        public String getDestination(){return destination;}

        public int getRideId() {
            return this.rideId;
        }

        public void setRideId(int rideId) {
            this.rideId = rideId;
        }

        public void setPassenger(Passenger passenger) {
            this.passenger=passenger;

        }

        public Passenger getpassenger(){return passenger;}

        public void setStatus(String rideStatus) {
            this.rideStatus=rideStatus;
        }
        public String getStatus(){return rideStatus;}


        public void addToMap(int driverId,String price){
            rideOffers.put(driverId, price);

        }

        public  Map<Integer, String>getRideoffers(){return rideOffers;}

        public void setDriver(Driver driver) {
            this.driver=driver;
        }

        public Driver getDriver(){return driver;}



}

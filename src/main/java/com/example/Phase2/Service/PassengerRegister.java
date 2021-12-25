package com.example.Phase2.Service;

import com.example.Phase2.model.Iregister;
import com.example.Phase2.model.Passenger;
import com.example.Phase2.model.User;

public class PassengerRegister implements Iregister {

    @Override
    public User registerLogic(String userName, String email, String mobileNum, String password) {
        User passenger=new Passenger();
        passenger.setEmail(email);
        passenger.setMobileNum(mobileNum);
        passenger.setPassword(password);
        passenger.setUserName(userName);
        passenger.setStatus("Active");
        return passenger;
    }
}

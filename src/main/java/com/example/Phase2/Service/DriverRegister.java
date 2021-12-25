package com.example.Phase2.Service;

import com.example.Phase2.model.Driver;
import com.example.Phase2.model.Iregister;
import com.example.Phase2.model.User;

import java.util.Scanner;

public class  DriverRegister implements Iregister {

    @Override
    public User registerLogic(String userName, String email, String mobileNum, String password) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter nationalId: ");
        String nationalId = input.next();
        System.out.println("Enter licenseId:");
        String licenseId = input.next();
        Driver driver=new Driver();
        driver.setEmail(email);
        driver.setMobileNum(mobileNum);
        driver.setPassword(password);
        driver.setUserName(userName);
        driver.setDrivingLicense(licenseId);
        driver.setNationalId(nationalId);
        driver.setStatus("pandding");
        return driver;
    }
}
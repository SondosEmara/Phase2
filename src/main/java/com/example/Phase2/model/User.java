package com.example.Phase2.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public abstract class User
{

    private String userName;
    private String email;
    private String mobileNum;
    private String password;
    private String status;
    private Iscreen userScreen;
    private  int userId ;



    public  User(){}
    public void  setUserId(int userId){this.userId=userId;}
    public int getUserId(){return userId;}

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNum() {
        return this.mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void setScreenType(Iscreen screenType) {
        userScreen = screenType;
    }

    void openScreen() {
        this.userScreen.displayFeatures(userId);
    }



}
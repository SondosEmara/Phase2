package com.example.Phase2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Admin extends User {
public  Admin(@JsonProperty("userName") String userName,
            @JsonProperty("email") String  email,
            @JsonProperty("mobileNum") String  mobileNum,
            @JsonProperty("password") String password) {

        this.setUserName(userName);
        this.setEmail(email);
        this.setMobileNum(mobileNum);
        this.setPassword(password);


}

}

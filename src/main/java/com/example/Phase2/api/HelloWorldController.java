package com.example.Phase2.api;

import com.example.Phase2.Service.UserManager;
import com.example.Phase2.model.Driver;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/hello")
@RestController
public class HelloWorldController {

public HelloWorldController(){
}
@PostMapping("AddNewDriverAPI")
public String AddNewDriverAPI(@RequestBody Driver driver){
    //Add new Driver using user manager service
    boolean added= UserManager.newRegister(driver);
    if (added){
        return "Driver added successfully";
    }
    else {
        return "Error: can't add this Driver.";
    }


}

}

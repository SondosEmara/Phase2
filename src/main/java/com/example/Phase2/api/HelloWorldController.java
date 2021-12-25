package com.example.Phase2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/hello")
@RestController
public class HelloWorldController {

public HelloWorldController(){

}
@GetMapping

public String mohamed(){
    return "hiiii";
}


@PostMapping
public String test(@RequestBody Object obj){
        return "hiiii";
    }

}

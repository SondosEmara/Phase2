package com.example.Phase2.api;

import com.example.Phase2.Service.UserManager;
import com.example.Phase2.model.Admin;
import com.example.Phase2.model.Iscreen;
import com.example.Phase2.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/auth")
@RestController
public class UserAuthentication {

        public UserAuthentication(){

        }

        public  void LoginAPI(){

        }

        public  void LogoutAPI(){

        }
        public  void RegistAsUserAPI(){

        }
        public  void RegistAsDriverAPI(){

        }

        @PostMapping("addNewAdminAPI")
        public String AddNewAdminAPI(@RequestBody Admin admin){
            //Add new admin using user manager service
            admin.setStatus("admin");
            boolean added=UserManager.addNewAdmin(admin);

            if (added){
                return "Admin added successfully";
            }
            else {
                return "Error: can't add this admin.";
            }


        }

}

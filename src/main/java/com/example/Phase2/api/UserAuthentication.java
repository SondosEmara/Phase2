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
        public  class AdminData{
                private String userName;
                private String email;
                private String mobileNum;
                private String password;


                public String getUserName() {
                return this.userName;
            }

                public String getPassword() {
                return this.password;
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






        }
        @PostMapping("addNewAdminAPI")
        public String AddNewAdminAPI(@RequestBody Admin admin){
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

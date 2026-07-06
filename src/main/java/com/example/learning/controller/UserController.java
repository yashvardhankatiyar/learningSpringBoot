package com.example.learning.controller;
import com.example.learning.Object.UserDetailedDTO;
import com.example.learning.entity.UserEntity;
import com.example.learning.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/Status")
    public String fun() {
        return "perfect working";
    }

    @PostMapping("/addUser")
    public UserEntity fun2(@RequestBody UserEntity body){
        return userService.saveUser(body);
    }

    @GetMapping("/getAllUser")
    public List<UserEntity> GetAllUser(){
        return userService.fillAllUsers();
    }

    @DeleteMapping("/deleteUsers")
    public String deleteUsers(@RequestParam List<Long> ids){
        userService.deleteUsers(ids);
        return "Deleted";
    }

    @GetMapping("/getUserDetails")
    public UserDetailedDTO getUserDetails(@RequestParam int id){
        UserDetailedDTO UDTO = new UserDetailedDTO(id);
        userService.userDetails(UDTO);
        return UDTO;
    }
}

package com.example.learning.controller;
import com.example.learning.Object.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/v1")
    public String fun() {
        return "hit";
    }

    @PostMapping("/v1")
    public void fun2(@RequestBody UserDTO body){
        System.out.println("age : " + body.age());
        System.out.println("name : " + body.userName());
        System.out.println("isEligible : " + body.checkEligibility());
        System.out.println("update name : " + body.addPrefix());
    }
}

package com.example.learning.Object;

public record UserDTO(
        String userName,
        int age
) {
    public boolean checkEligibility(){
        return age >= 18;
    }

    public String addPrefix(){
        return "mr." + userName;
    }
}

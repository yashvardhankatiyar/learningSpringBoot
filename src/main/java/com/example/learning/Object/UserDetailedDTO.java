package com.example.learning.Object;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailedDTO {

    @JsonIgnore
    private long id;
    private int age;
    private String name;
    private String isValidAge;

    public UserDetailedDTO(int UserID){
        this.id = UserID;
    }

    public void setNameAndAge(String userName, int userAge){
        this.name = userName;
        this.age = userAge;
        setValidity(age);
    }

    private void setValidity(int userAge){
        if(userAge >= 18) isValidAge = "eligible";
        else isValidAge = "not eligible";
    }

    public long getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getIsValidAge(){ return isValidAge;}

}

package com.example.aop.security;

/**
 * Created by krishna_hotha on 4/21/15.
 */
public class UserInfo {

    private String name;
    private String password;


    public UserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}

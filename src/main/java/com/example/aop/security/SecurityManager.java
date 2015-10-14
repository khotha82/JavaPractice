package com.example.aop.security;

/**
 * Created by krishna_hotha on 4/21/15.
 */
public class SecurityManager {

    private static ThreadLocal<UserInfo>userInfoThreadLocal =new ThreadLocal<>();

    public void login(String userName, String password){

        userInfoThreadLocal.set(new UserInfo(userName,password));
    }
    public void logout(){
        userInfoThreadLocal.set(null);
    }

    public UserInfo getUser(){

        return userInfoThreadLocal.get();
    }
}

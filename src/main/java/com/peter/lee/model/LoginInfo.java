package com.peter.lee.model;

/**
 * @program: lee
 * @description:
 * @author: Peter
 * @date: 2023/2/6 10:34
 **/
public class LoginInfo {

    String user;

    String password;

    String email;

    public LoginInfo(String user, String password, String email) {
        this.user = user;
        this.password = password;
        this.email = email;
    }

    public LoginInfo() {
    }

    public LoginInfo(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

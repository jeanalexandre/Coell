package com.coell.Coell.model;

public class JwtUser {
    private String userName;
    private String role;

    public JwtUser(String userName, String role) {
        this.userName = userName;
        this.role = role;
    }

    public JwtUser() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

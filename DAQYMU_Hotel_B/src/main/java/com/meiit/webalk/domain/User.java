package com.meiit.webalk.domain;


public class User {
    private String email;
    private String pswd;

    public User() {

    }

    public User(String email, String pswd) {
        super();
        this.email = email;
        this.pswd = pswd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

}

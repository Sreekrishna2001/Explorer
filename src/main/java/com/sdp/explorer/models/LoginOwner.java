package com.sdp.explorer.models;

public class LoginOwner {
    public String email;
    public String psw;

    @Override
    public String toString() {
        return "LoginOwner{" +
                "email='" + email + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}

package com.demo.member.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Login {
    
    @Id
    @GeneratedValue
    Long Id;
    String email;
    Date loginDate;
    Date logoutDate;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getLoginDate() {
        return loginDate;
    }
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
    public Date getLogoutDate() {
        return logoutDate;
    }
    public void setLogoutDate(Date logoutDate) {
        this.logoutDate = logoutDate;
    }
}

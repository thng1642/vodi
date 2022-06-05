package com.example.vodionlinemoviewebsite.dto;

import com.example.vodionlinemoviewebsite.error.EmailValidation;

public class AccountDto {

    @EmailValidation
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AccountDto{" + "email='" + email + '\'' + ", password='" + password + '\'' + '}';
    }
}

package com.example.vodionlinemoviewebsite.dto;

import com.example.vodionlinemoviewebsite.error.EmailNotExisted;
import com.example.vodionlinemoviewebsite.error.EmailValidation;
import com.example.vodionlinemoviewebsite.error.PasswordValidation;

@PasswordValidation
public class AccountDto {

    @EmailValidation // signup
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

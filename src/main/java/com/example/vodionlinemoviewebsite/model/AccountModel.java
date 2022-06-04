package com.example.vodionlinemoviewebsite.model;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class AccountModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private int id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "bankAccountNumber")
    private String bankAccountNumber;

    @Column(name = "registrationDate")
    private String dataCreate;

    @Column(name = "expiryDate")
    private String expiryDate;

    @Column(name = "isAdmin")
    private boolean isAdmin;

    @Column(name = "isVIP")
    private boolean isVIP;

    public AccountModel() {
    }

    public AccountModel(int id, String userName, String password, String fullName, String bankAccountNumber,
                        String dataCreate, String expiryDate, boolean isAdmin, boolean isVIP) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.bankAccountNumber = bankAccountNumber;
        this.dataCreate = dataCreate;
        this.expiryDate = expiryDate;
        this.isAdmin = isAdmin;
        this.isVIP = isVIP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(String dataCreate) {
        this.dataCreate = dataCreate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }
}
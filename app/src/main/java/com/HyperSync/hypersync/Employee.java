package com.HyperSync.hypersync;

import java.io.Serializable;

public class Employee implements Serializable {
    private String firstname,lastname,phone,email,id,admin,userName;

    public Employee(){};

    public Employee(String firstname, String lastname, String phone, String email, String id, String admin) {
        userName = firstname +" "+ lastname;
        this.phone = phone;
        this.email = email;
        this.id = id;
        this.admin = admin;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() { return email; }

    public String getId() { return id; }

    public String getAdmin() { return admin; }

    public String getUserName() { return userName; }
}

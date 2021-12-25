package com.HyperSync.hypersync.model;

public class Worker {
    private String email;
    private String name;
    private String company;
    private String category;

    public Worker(String email, String name, String company, String category) {
        this.email = email;
        this.name = name;
        this.company = company;
        this.category = category;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

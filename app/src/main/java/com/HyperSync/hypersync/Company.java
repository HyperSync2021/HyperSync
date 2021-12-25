package com.HyperSync.hypersync;

public class Company {
    private String companyEmail;
    private String contactNo;
    private String Address;
    private String gstNo;

    public Company(String companyEmail, String contactNo, String address, String gstNo) {
        this.companyEmail = companyEmail;
        this.contactNo = contactNo;
        Address = address;
        this.gstNo = gstNo;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }
}

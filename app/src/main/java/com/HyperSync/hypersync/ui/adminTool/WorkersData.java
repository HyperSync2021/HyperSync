package com.HyperSync.hypersync.ui.adminTool;

public class WorkersData {
    String mGmail;
    String mId;
    String company;
    boolean worker;


    public WorkersData(String mGmail, String mId, boolean worker,String company) {
        this.mGmail = mGmail;
        this.mId = mId;
        this.company = company;
        this.worker = worker;
    }
}

package com.company.currencyConverter.client;

import java.util.Date;

public class Client {

    private Date date;
    private String documents;
    private String fullName;


    public Client(String fullName, Date date, String documents) {
        this.fullName = fullName;
        this.date = date;
        this.documents = documents;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "date=" + date +
                ", documents='" + documents + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

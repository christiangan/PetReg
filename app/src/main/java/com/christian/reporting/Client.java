package com.christian.reporting;

/**
 * Created by Christian on 2/23/2018.
 */

public class Client {
//    private String name;
//    private String roll;
//    private String address;
//    private String branch;
    private String email;
    private String lastName;
    private String firstName;
    private String middleName;
    private String contact;
    private String dateRegistered;
    private String sexDesc;
    private String bday;
    private String clientId;


    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public void setSexDesc(String sexDesc) {
        this.sexDesc = sexDesc;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getContact() {
        return contact;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public String getSexDesc() {
        return sexDesc;
    }

    public String getBday() {
        return bday;
    }

    public String getEmail() {
        return email;
    }

    public String getClientId() {
        return clientId;
    }

}

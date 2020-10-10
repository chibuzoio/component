package com.chibuzo.component.model;

import java.util.Arrays;

public class UserAccount {
    private int userAccountId;
    private String firstName;
    private String lastName;
    private String gender;
    private String emailAddress;
    private String phoneNumber;
    private String town;
    private String state;
    private String country;
    private String password;
    private byte[] profilePicture;
    private String billingAddress;
    private String registrationDate;
    private int passwordTimestamp;
    private String notificationTableName;
    private String productWishListTable;
    private String stockroomWagonTable;
    private String productReceptionTable;

    public int getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(int userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getPasswordTimestamp() {
        return passwordTimestamp;
    }

    public void setPasswordTimestamp(int passwordTimestamp) {
        this.passwordTimestamp = passwordTimestamp;
    }

    public String getNotificationTableName() {
        return notificationTableName;
    }

    public void setNotificationTableName(String notificationTableName) {
        this.notificationTableName = notificationTableName;
    }

    public String getProductWishListTable() {
        return productWishListTable;
    }

    public void setProductWishListTable(String productWishListTable) {
        this.productWishListTable = productWishListTable;
    }

    public String getStockroomWagonTable() {
        return stockroomWagonTable;
    }

    public void setStockroomWagonTable(String stockroomWagonTable) {
        this.stockroomWagonTable = stockroomWagonTable;
    }

    public String getProductReceptionTable() {
        return productReceptionTable;
    }

    public void setProductReceptionTable(String productReceptionTable) {
        this.productReceptionTable = productReceptionTable;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "userAccountId=" + userAccountId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", town='" + town + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", password='" + password + '\'' +
                ", profilePicture=" + Arrays.toString(profilePicture) +
                ", billingAddress='" + billingAddress + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", passwordTimestamp=" + passwordTimestamp +
                ", notificationTableName='" + notificationTableName + '\'' +
                ", productWishListTable='" + productWishListTable + '\'' +
                ", stockroomWagonTable='" + stockroomWagonTable + '\'' +
                ", productReceptionTable='" + productReceptionTable + '\'' +
                '}';
    }
}



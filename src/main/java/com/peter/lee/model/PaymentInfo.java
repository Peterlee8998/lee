package com.peter.lee.model;

/**
 * @program: lee
 * @description:
 * @author: Peter
 * @date: 2023/2/6 10:37
 **/
public class PaymentInfo {

    String name;

    String lastName;

    String phone;

    String address;

    String city;

    String zip;

    String cardType;

    String cardHolder;

    String cardNum;

    String month;

    String year;

    String cardCVV;

    public PaymentInfo() {
    }

    public PaymentInfo(String name, String lastName, String phone, String address, String city, String zip, String cardType, String cardHolder, String cardNum, String month, String year, String cardCVV) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.cardType = cardType;
        this.cardHolder = cardHolder;
        this.cardNum = cardNum;
        this.month = month;
        this.year = year;
        this.cardCVV = cardCVV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(String cardCVV) {
        this.cardCVV = cardCVV;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", cardCVV='" + cardCVV + '\'' +
                '}';
    }
}

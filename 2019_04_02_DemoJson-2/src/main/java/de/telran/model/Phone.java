package de.telran.model;

public class Phone {

    String countryCode;
    String PhoneNumber;

    public Phone() {
    }

    public Phone(String countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.PhoneNumber = phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "countryCode='" + countryCode + '\'' +
                ", PhoneNumber='" + PhoneNumber;
    }
}


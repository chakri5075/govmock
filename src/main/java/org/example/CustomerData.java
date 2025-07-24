package org.example;

public class CustomerData {
    private String fullName;
    private String dateOfBirth;
    private String nationalInsuranceNumber;
    private String address;
    private String email;
    private String phoneNumber;
    private String postalCode;

    public CustomerData() {}

    public CustomerData(String fullName, String dateOfBirth, String nationalInsuranceNumber, String address, String email, String phoneNumber, String postalCode) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

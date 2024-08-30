//Example for RunTime Polymorphism/Method Overriding

package com.xworkz.ottPlatform.amazonPrime;

public class Prime {

    private int primeId;
    private String email;
    private String passWord;
    private double subscriptionFee;
    private String platformName;

    @Override
    public String toString() {
        return "Prime{" +
                "primeId='" + primeId + '\'' +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' +
                ", subscriptionFee=" + subscriptionFee +
                ", platformName='" + platformName + '\'' +
                '}';
    }

    public void setPrimeId(int primeId) {
        this.primeId = primeId;
    }

    public int getPrimeId() {
        return primeId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setSubscriptionFee(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }
}

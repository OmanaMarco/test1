package com.java.gym.backend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Billing {
    private int amountToPay;
    private String date;
    private LocalDateTime timeOfPurchase;
    private float tax = (float) (getAmountToPay() * Double.parseDouble("16%"));

    public int getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(int amountToPay) {
        this.amountToPay = amountToPay;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public void setTimeOfPurchase(LocalDateTime timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public Billing(int amountToPay, String date, LocalDateTime timeOfPurchase, float tax) {
        this.amountToPay = amountToPay;
        this.date = date;
        this.timeOfPurchase = timeOfPurchase;
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Billing{" +
                ", amountToPay=" + amountToPay +
                ", date=" + date +
                ", timeOfPurchase=" + timeOfPurchase +
                ", tax=" + tax +
                '}';
    }
}
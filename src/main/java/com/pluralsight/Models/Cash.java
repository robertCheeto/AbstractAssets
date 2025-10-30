package com.pluralsight.Models;

public class Cash extends Asset {
    private double amount;

    public Cash(String description, String dateAcquired, double originalCost, double amount) {
        super(description, dateAcquired, originalCost);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getValue() {
        return this.amount;
    }
}

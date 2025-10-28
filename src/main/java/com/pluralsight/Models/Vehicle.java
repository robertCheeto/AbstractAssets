package com.pluralsight.Models;

public class Vehicle extends Asset {
    private String makeModel;
    private int year, odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = getOriginalCost();
        int currentYear = 2025;

        if (odometer > 100000) {
            if ((!this.makeModel.contains("Honda") && !this.makeModel.contains("Toyota"))) {
                value = value - (value * .25);
                for (int i = this.year; i <= currentYear; i++) {
                    if ((currentYear - this.year <= 3) && (currentYear - this.year >= 0)) {
                        value = value - (value * .03);
                    } else if ((currentYear - this.year <= 6) && (currentYear - this.year >= 4)) {
                        value = value - (value * .06);
                    } else if ((currentYear - this.year <= 10) && (currentYear - this.year >= 7)) {
                        value = value - (value * .08);
                    } else {
                        value = 1000.00;
                    }
                }
            }

            else {
                for (int i = this.year; i <= currentYear; i++) {
                    if ((currentYear - this.year <= 3) && (currentYear - this.year >= 0)) {
                        value = value - (value * .03);
                    } else if ((currentYear - this.year <= 6) && (currentYear - this.year >= 4)) {
                        value = value - (value * .06);
                    } else if ((currentYear - this.year <= 10) && (currentYear - this.year >= 7)) {
                        value = value - (value * .08);
                    } else {
                        value = 1000.00;
                    }
                }
            }
        }

        else {
            for (int i = this.year; i <= currentYear; i++) {
                if ((currentYear - this.year <= 3) && (currentYear - this.year >= 0)) {
                    value = value - (value * .03);
                } else if ((currentYear - this.year <= 6) && (currentYear - this.year >= 4)) {
                    value = value - (value * .06);
                } else if ((currentYear - this.year <= 10) && (currentYear - this.year >= 7)) {
                    value = value - (value * .08);
                } else {
                    value = 1000.00;
                }
            }
        }
        return value;
    }
}


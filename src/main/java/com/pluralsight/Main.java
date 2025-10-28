package com.pluralsight;

import com.pluralsight.Models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House home1 = new House("My First Home", "May 23, 2023",115935.18, "1618 Poolside Lane, Charlotte, NC 28208", 4, 1600, 5000);
        House home2 = new House("Cabin Home", "April 23, 1998", 5000.88, "100 Roger Hideaway, Champion, PA", 2, 10000, 20000);

        Vehicle car1 = new Vehicle("First Car", "November 30, 2022", 23459.89, "Hyundai Elantra", 2023, 15230);
        Vehicle car2 = new Vehicle("Big Ole Truck", "June 3, 1999", 18999.00, "Toyota Tacoma", 1995, 156723);



    }
}

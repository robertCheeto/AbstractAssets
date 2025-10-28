package com.pluralsight;

import com.pluralsight.Models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House home1 = new House("My First Home", "May 23, 2023",115935.18, "1618 Poolside Lane, Charlotte, NC 28208", 4, 1600, 5000);
        House home2 = new House("Cabin Home", "April 23, 1998", 5000.88, "100 Roger Hideaway, Champion, PA", 2, 10000, 20000);

        Vehicle car1 = new Vehicle("First Car", "November 30, 2022", 23500.00, "Hyundai Elantra", 2023, 156723);
        Vehicle car2 = new Vehicle("Big Ole Truck", "June 3, 1999", 23500.00, "Toyota Tacoma", 1998, 156723);

        assets.add(home1);
        assets.add(home2);
        assets.add(car1);
        assets.add(car2);

//        for (int i = 0; i < assets.size(); i++) {
//            System.out.printf("%s | %s | $%.2f",assets.get(i).getDescription(), assets.get(i).getDateAcquired(), assets.get(i).getValue());
//            System.out.println();
//        }

        for (int i = 0; i < assets.size(); i++) {
            if (assets.get(i) instanceof House) {
                System.out.printf("%s | %s | $%.2f | %s",assets.get(i).getDescription(), assets.get(i).getDateAcquired(), assets.get(i).getValue(), ((House) assets.get(i)).getAddress());
                System.out.println();
            }
            else if (assets.get(i) instanceof Vehicle) {
                System.out.printf("%s | %s | $%.2f | %s",assets.get(i).getDescription(), assets.get(i).getDateAcquired(), assets.get(i).getValue(), ((Vehicle) assets.get(i)).getMakeModel());
                System.out.println();
            }
        }
    }
}

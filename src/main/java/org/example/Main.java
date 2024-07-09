package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner FTKM = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter 1 for km or 2 for ft:");
        Integer FTorKM = FTKM.nextInt();  // input lezen om ft of km te berekenen.
        int Xm, Xft;
        Xm = 343; // variabele voor berekening
        Xft = 1125; // variabele voor berekening
        int x = 0; // voor een loop
        double distance2 = 0;
        while (x == 0) {
            Scanner sec = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter seconds between lighting and thunder:");
            Double seconds = sec.nextDouble();  // Read user input
            if (FTorKM == 1){  // if statement om te kijken of het in km of ft moet.
                double distance = (seconds * Xm)/1000;
                double kmh = (((distance2 - distance)/seconds)* 3.6);
                double speed = (distance2/kmh);
                distance2 = distance;
                System.out.println(distance + "km");
                System.out.printf("%.2f km/h%n", kmh);
                System.out.printf("%.2f seconds%n", speed);
            }else {
                double distance = (seconds * Xft);
                double fts = (((distance2 - distance)/seconds)* 3.6);
                double speed = (distance2/fts);
                distance2 = distance;
                System.out.println(distance + "ft");
                System.out.printf("%.2f ft/h%n", fts);
                System.out.printf("%.2f seconds%n", speed);
            }
            x++;
        x--;
        }
    }
}
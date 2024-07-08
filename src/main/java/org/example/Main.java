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
        while (x == 0) {
            Scanner sec = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter seconds between lighting and thunder:");
            Double seconds = sec.nextDouble();  // Read user input
            if (FTorKM == 1){  // if statement om te kijken of het in km of ft moet.
                seconds = (seconds * Xm)/1000;
                System.out.println(seconds + "KM");
            }else {
                seconds = (seconds * Xft)/1000;
                System.out.println(seconds + "ft");
            }
            x++;
        x--;
        }
    }
}
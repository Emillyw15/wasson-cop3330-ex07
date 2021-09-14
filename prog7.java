/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String length = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.print("What is the width of the room in feet? ");
        String width = b.nextLine();

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        int one = Integer.valueOf(length), two = Integer.valueOf(width);
        int area = one * two;

        System.out.println("The area is " + area + " square feet.");

        double convert = 0.09290304;
        double m = area * convert;

        System.out.println(m + " square meters.");
    }
}

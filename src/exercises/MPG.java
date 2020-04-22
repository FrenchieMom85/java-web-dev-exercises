package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner gas = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        double miles = gas.nextDouble();
        System.out.println("How many gallons of gas used?");
        double gallons = gas.nextDouble();
        double mpgs = miles / gallons;
        System.out.println("Your miles-per-gallon:"+mpgs);
}}

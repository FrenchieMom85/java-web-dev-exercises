package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner math = new Scanner(System.in);
        double radius;
        do{
            System.out.print("Enter the radius: ");
            while(!math.hasNextInt()){
                String input = math.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
                System.out.print("Enter the radius: ");
            }
            radius = math.nextDouble();
            double area = Circle.getArea(radius);
            System.out.println("The area of circle is: " + area);
        }while(radius < 0);
    }
}
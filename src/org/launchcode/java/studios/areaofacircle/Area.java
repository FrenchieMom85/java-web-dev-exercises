package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner math = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = math.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
    }
}

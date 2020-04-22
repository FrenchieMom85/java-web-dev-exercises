package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        double recLength = rec.nextDouble();
        System.out.println("What is the width of the rectangle?");
        double recWidth = rec.nextDouble();
        double area = recLength * recWidth;
        System.out.println("The area of rectangle is:"+area);
    }}

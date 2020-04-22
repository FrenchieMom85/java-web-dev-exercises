package exercises;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

public class Corona {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Have you got that Rona?: ");
        String answer = input.nextLine();
        if(answer.equals("yes")) {
            System.out.println("Please self-quarantine");
        }
        if (answer.equals("no")) {
            System.out.println("Go on about your business");
        }
}}

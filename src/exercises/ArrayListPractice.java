package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> someInts = new ArrayList<>();
        someInts.add(1);
        someInts.add(16);
        someInts.add(22);
        someInts.add(4);
        someInts.add(33);
        someInts.add(8);
        someInts.add(9);
        someInts.add(10);
        someInts.add(32);
        someInts.add(2);

        int evenSum = 0;

        for( int i : someInts){
            if( i % 2 == 0)
                evenSum = evenSum + i;
        }
        System.out.println("Sum of all even numbers are: "+evenSum);

    }
}

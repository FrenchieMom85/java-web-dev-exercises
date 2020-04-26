package studioCountingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> charactersCount = new HashMap<>();
        Scanner input = new Scanner(System.in);
//        String myString = "If the product of two terms is zero then common sense says at least" +
//                " one of the two terms has to be zero to start with. So if you move all the" +
//                " terms over to one side, you can put the quadratics into a form that" +
//                " can be factored allowing that side of the equation to equal zero." +
//                " Once you’ve done that, it’s pretty straightforward from there.";
        String myString;
        System.out.println("Enter a string: ");
        myString = input.nextLine();
        char[] charactersInString = myString.replaceAll("[^a-zA-Z]","").toLowerCase().toCharArray();



        for(char character : charactersInString){
            if (charactersCount.containsKey(character)){
                charactersCount.put(character, charactersCount.get(character)+1);
            } else {
                charactersCount.put(character, 1);
            }

        }
        System.out.println(charactersCount);

}}
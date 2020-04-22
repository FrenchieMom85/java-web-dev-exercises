package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String story = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a boo,' thought Alice 'without pictures or conversation?'";
        System.out.println(story);
        System.out.println("Enter a term to search for: ");
        String term = input.nextLine();
        System.out.println(story.toLowerCase().contains(term.toLowerCase()));
        System.out.println(story.toLowerCase().indexOf(term.toLowerCase()));
        System.out.println(term.length());
        String removeTerm = story.toLowerCase().replaceAll(term.toLowerCase(),"");
        System.out.println(removeTerm);
    }
}


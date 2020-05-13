package exercises;

import java.util.Arrays;

public class SuessArray {
    public static void main(String[] args){
        String foxSox = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] eggsHam = foxSox.split(" ");
        System.out.println(Arrays.toString(eggsHam));

        String[] drSuess = foxSox.split("\\.");
        System.out.println(Arrays.toString(drSuess));

    }
}

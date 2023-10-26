package Week04_Tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_Agil {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));

    }


    public static String removeDuplicates(String input){

        String output = "";
        char [] chars = input.toCharArray();

        Set<Character> uniqueList = new LinkedHashSet<>();

        for (char eachChar : chars) {

            uniqueList.add(eachChar);
        }

        System.out.println(uniqueList.toString());


        for (Character character : uniqueList) {
            output+=character;
        }


        return output;
    }
}

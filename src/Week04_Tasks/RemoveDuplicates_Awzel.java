package Week04_Tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_Awzel {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));

        System.out.println(removeDuplicateCharacters("aaaaadddssssssfggghhhl"));

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
    public static String removeDuplicateCharacters(String str) {
        String strReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if (!strReturn.contains(str.substring(i,i+1)))
                strReturn += str.charAt(i);
        }
        return strReturn.trim();

    }


}

package week05_Tasks;


/*

1.
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindTheUnique {

    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));
        System.out.println(unique("AAABBBCCCxyzdef0123"));
        System.out.println("---------------------------");

        System.out.println(unique2("AAABBBCCCDEF"));
        System.out.println(unique2("AAABBBCCCxyzdef0123"));
        System.out.println("---------------------------");

        /*
        System.out.println(unique3("AAABBBCCCDEF"));
        System.out.println(unique3("AAABBBCCCxyzdef0123"));
        System.out.println("---------------------------");

        System.out.println(unique4("AAABBBCCCDEF"));
        System.out.println(unique4("AAABBBCCCxyzdef0123"));
        System.out.println("---------------------------");
        */

    }

    public static String unique(String str) {

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0; // to make sure the loop resets each time 

            for (int j = 0; j < str.length(); j++) { // loop through the string against itself

                if (str.charAt(i) == str.charAt(j)) { // if the characters are the same
                    count++; // increase the count
                }
            }

            if (count == 1) { // if the count is 1, it means the character is unique
                result += str.charAt(i);
            }
        }

        return result;
    }


    public static String unique2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) { // the first occurrence of the character is the last occurrence of the character
                result += c;
            }
        }
        return result;
    }


/*    public static String unique3(String str) { // returns "ABCDEF"
        String uniqueStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (uniqueStr.indexOf(c) == -1) {
                uniqueStr += c;
            }
        }
        return uniqueStr;
    }


    public static String unique4(String str) { // returns"ABCDEF"

        Set<Character> set = new LinkedHashSet<>();
        String result = "";

        for (char c : str.toCharArray()) {
            int count = 0;

            if (!set.contains(c)) {
                set.add(c);
                result += c;
            }
        }
        return result;
    }*/
}



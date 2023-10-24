package Week04_Tasks;

import java.util.Arrays;

public class SameLetters_Agil {
    public static void main(String[] args) {



        System.out.println(validAnagram("abz", "bca"));
        System.out.println(validAnagram("abc", "abb"));
        System.out.println(validAnagram("azc", "abb"));
        System.out.println(validAnagram("wwwzzzaaapp", "wwwzzzaaapp"));
    }


    public static boolean validAnagram(String s, String t) {
        // if lengths of Strings are not equal, then they cannot be anagram.
        if (s.length() != t.length()) {
            return false;
        }
//we create array of length 26 and initialize all values with zero.
        int[] counts = new int[26];
        System.out.println(counts.length);

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)-97]++;
            counts[t.charAt(i)-97]--;
        }

        for (int i = 0; i < counts.length; i++) {
            if(counts[i]==0){
            }
        }
        return true;
    }
}

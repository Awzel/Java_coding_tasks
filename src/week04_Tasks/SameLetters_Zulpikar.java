package week04_Tasks;


/*
2.
String -- Same letters
Write a return method that checks if a string is built out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SameLetters_Zulpikar {

    public static void main(String[] args) {

        System.out.println(sameLetters("aabccc", "cab"));
        System.out.println(sameLetters("aabcccdddddd", "cabddddd"));
        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("aabcccdddddd", "cabddddde"));

    }

    public static boolean sameLetters(String str1, String str2) {

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }
        return set1.equals(set2);
    }

}

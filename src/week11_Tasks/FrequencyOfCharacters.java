package week11_Tasks;

/*
    Map-- Frequency of Characters
    Writes a method that prints the frequency of each character from a String.
* */

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println("frequencyOfChar(\"hello\") = " + frequencyOfChar("hello"));
        System.out.println("frequencyOfChar(\"pneumonoultramicroscopicsilicovolcanoconiosis\") = " + frequencyOfChar("pneumonoultramicroscopicsilicovolcanoconiosis"));
        System.out.println();
        System.out.println("frequencyOfChar(\"hello\") = " + frequencyOfChar2("hello"));
        System.out.println("frequencyOfChar(\"pneumonoultramicroscopicsilicovolcanoconiosis\") = " + frequencyOfChar2("pneumonoultramicroscopicsilicovolcanoconiosis"));
        System.out.println();

    }

    public static Map<String, Integer> frequencyOfChar(String str) {

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            map.put(each, frequency);
        }
        return map;
    }

    public static Map<Character, Integer> frequencyOfChar2(String str) {

        Map<Character, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!result.containsKey(charAt)) {
                result.put(charAt, 0);
            }
            result.put(charAt, result.get(charAt) + 1);
        }
        return result;
    }


}

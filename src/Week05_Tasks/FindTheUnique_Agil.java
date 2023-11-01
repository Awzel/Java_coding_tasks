package Week05_Tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheUnique_Agil {

    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCCCDEF"));
    }


    public static String findUnique(String input){
// I convert the input string to an array of characters
        char [] chars = input.toCharArray();
 // I create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

  // I  iterate through the input string and populates the frequencyMap.
        for (char each : input.toCharArray()) {
            // I use getOrDefault and put methods: if the frequencyMap contains the character, it returns the corresponding value and increment it
            // by one,  if the map doesn't contain the key, it returns a default value and increment it by one

            frequencyMap.put(each, frequencyMap.getOrDefault(each, 0) + 1);
        }

        System.out.println(frequencyMap);

        String output = "";

        for (char each : chars) {
            if(frequencyMap.get(each)==1){
                output+=each;
            }
        }
return  output;
    }
}
/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
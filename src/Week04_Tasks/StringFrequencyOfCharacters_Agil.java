package Week04_Tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringFrequencyOfCharacters_Agil {
    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDD"));
    }
    public static Map<Character, Integer> frequencyOfChars2 (String input){

        String output = "";

        Map<Character, Integer> map = new LinkedHashMap<>();

        char [] chars = input.toCharArray();

        for (char eachChar : chars) {
            if(map.containsKey(eachChar)){
                map.replace(eachChar,map.get(eachChar) + 1);
            } else {
                map.put(eachChar,1);
            }
        }

        for (Character character : map.keySet()) {
            output = output + character;
            output =  output + map.get(character);
        }
        return map;

    }

    public static String frequencyOfChars (String input){

        String output = "";

        Map<Character, Integer> map = new LinkedHashMap<>();

        char [] chars = input.toCharArray();

        for (char eachChar : chars) {

            if(map.containsKey(eachChar)){


                map.replace(eachChar,map.get(eachChar) + 1);

            } else {
                map.put(eachChar,1);
            }

        }

        for (Character character : map.keySet()) {
            output = output + character;
            output =  output + map.get(character);
        }

        return output;

    }

}

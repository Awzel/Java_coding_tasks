package Week05_Tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindTheUnique_Sabina {

    //With the given String str = "AAbb2223333RRRRSSSTBBBB"; find and return only unique ones

    public static void main(String[] args) {
        String str = "AAbb2223333RRRRSSSTBBBB";

        System.out.println(uniqueCharacters(str));

        System.out.println("uniqueChar(str) using SET = " + uniqueChar(str));

        System.out.println(unique2("AAABBBCCCDEF"));

    }

// 1. So, I am creating a method that accepts String argument and returns String value without duplicates
    // 2. We will need to separate each character in the String either by regular loop or for each loop.
    // 3. In this case I like to work with for each loop, where from provided String we use a method toCharArray()
    // that converts our String to array of characters, which allows us to use forEach loop
    //4. Since we need a new String object to create our result we will need to create a new String Object
    //5. Once we iterate though we need a condition under which characters will be added into our output String
    //6. If output doesn't contain (char) each, it should be added

    public static String uniqueCharacters(String str) {
        String output = "";

        for (char each : str.toCharArray()) {
            if (!(output.contains(each + ""))) {
                output += each;
            }
        }

        return output;
    }


    public static Set<Character> uniqueChar(String str) {

        Set<Character> unique = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            unique.add(str.charAt(i));
        }

        return unique;
    }


    public static String unique2(String str) {

        Set<Character> set = new LinkedHashSet<>();
        String result = "";

        for (char outerChar : str.toCharArray()) {

            int count = 0;

            for (char innerChar : str.toCharArray()) {
                if (outerChar == innerChar){
                    count++;
                }
            }

            if (!set.contains(outerChar) && count == 1) {
                set.add(outerChar);
                result += outerChar;
            }

        }
        return result;

    }
}

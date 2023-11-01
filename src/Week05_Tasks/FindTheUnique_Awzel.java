package Week05_Tasks;

public class FindTheUnique_Awzel {



    public static String unique(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                result += currentChar;
            }
        }

        return result;
    }

    public static String uniqueCharacters(String str) {
        String returnString = "";
        for (char each : str.toCharArray()) {
            if (str.indexOf(each) == str.lastIndexOf(each)) {
                returnString += each;
            }
        }
        return returnString;
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String uniqueChars = unique(input);
        System.out.println(uniqueChars); // Output: "DEF"

        System.out.println(uniqueCharacters("ACCCCDAAAEAAAGFHHV"));


    }

}
/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
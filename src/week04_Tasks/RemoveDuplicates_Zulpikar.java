package week04_Tasks;


/*
3.
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/

public class RemoveDuplicates_Zulpikar {

    public static void main(String[] args) {
        System.out.println("removeDup(\"AAAABBBCCVVVV\") = " + removeDup("AAAABBBCCVVVV"));
    }

    public static String removeDup(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

           // If the result does not contain the current character, append it
           if (!result.contains(String.valueOf(str.charAt(i)))) { //string valueOf() method converts different types of values into string.

                // If the character is not repeated, append it to the result
                result += str.charAt(i);

            }
        }
        return result;
    }

}

package week04_Tasks;


/*
1.
String -- Frequency of Characters
Writes a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/

public class FrequencyOfCharacters_Zulpikar {

    public static void main(String[] args) {

        FrequencyOfChars("AAABBCDD");
        FrequencyOfChars("adfadfaj;lgjoiuperqn;vncoiuorejgkl;dajasdfj;lkhewpourf;ldajflafjvczxv");
    }

    public static void FrequencyOfChars(String str) {

        String result = "";

        for (int i=0; i<str.length(); i++){ //outer loop taking each letter one by one
            char ch = str.charAt(i);
            int count =0;

            for(int j=0; j< str.length(); j++){ //inner loop comparing each letter with the remaining letters
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if (!result.contains(ch + "")){ //if the letter is not present in the result, append it with its count
                result += ch + "" + count;
            }

        }

        System.out.println(result);

    }


}

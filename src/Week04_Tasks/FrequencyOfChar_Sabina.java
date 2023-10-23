package Week04_Tasks;

public class FrequencyOfChar_Sabina {
    //String -- Frequency of Characters
    //Write a return method that can find the frequency of
    //characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(frequencyOfChar(str));
    }


    public static String frequencyOfChar(String str) {

        String result = "";


        for (int i = 0; i < str.length(); i++) {

                int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (!(result.contains(str.charAt(i)+""))){
                    result += str.charAt(i);
                }
                if (result.contains(str.charAt(j)+"")){
                    count++;
                }
            }
           result += count;
        }


        return result;
    }


}

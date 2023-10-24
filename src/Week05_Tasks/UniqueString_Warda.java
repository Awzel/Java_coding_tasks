package src.Week05_Tasks;

public class UniqueString_Warda {

    public static void main(String[] args) {
        // In order to remove duplicates
        String str = "AAABBCDD";
        // I will assume we are given a Hardcoded String value , for instance "AAABBCDD"
        // My expected output would be ABCD
        String output = "";
        // first, I will create an empty String value for my output
        for (int i = 0; i < str.length(); i++) {
            // I will then use a For i loop , so i can get the index # for each character in the word
            char eachletter = str.charAt(i);
            // Then I will retrieve char value at each of these index #
            if (output.contains("" + eachletter)) {
                // Lastly, I will ask my script to check by if statement,
                // if there is an existing character in my output
                // then skip and go back to the beginning of the loop by using "continue"
                continue;
            } else {
                output += eachletter;
                // Otherwise add the value to the Output String.
                // This should continue till the end of the loop which is defined by the length of the Word.

            }
        }
        // Once done, use print statement outside of the loop to get the Final Output
        System.out.println(output);


    }
}

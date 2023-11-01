package Week05_Tasks;

public class UniqueCharacters_Warda {
    public static String uniqueCharacters(String str) {
        String output = "";
        char[] strArray = str.toCharArray();
        for (char eachletter : strArray) {
            if (str.indexOf(eachletter) == str.lastIndexOf(eachletter)) {
                output += eachletter;
            }

        }

        return output;
    }


    public static void main(String[] args) {


        String str = "AAABBCDDDEFGGHI";

        System.out.println("uniqueCharacters(str) = " + uniqueCharacters(str));
    }





      /*
        String output = "";
        char[] arraystr = str.toCharArray();
        System.out.println(Arrays.toString(arraystr)); my array of string value
        for (char eachletter : arraystr) {
            if(str.indexOf(eachletter)==str.lastIndexOf(eachletter))
            { output+=eachletter; }
        }
        System.out.println(output);
        // If I have a hardcoded String value, and you want to me to present you with values that are unique
        // there are many way for me to do this, but my favorite is using arrays.
        // I will assume you give me a String value with many duplicates and few characters without duplicate
        // my first step will be to create an empty String variable, I will give it a name output for ease of comunication.
        // then i will convert my String into an Array of characters, using toCharArray from the String class.
        // once i have my array, i will use for each loop to print each letters
        // then i will get the index # of each letter in two different ways , using indexOF and lastIndexOf
        // indexOf will look at the string from index 0 , onwards
        //last index Of will look at teh String from last index of String, so backwards
        // if both the index# matches, I will know it is a Unique character,
        // that value will then be stored in my output String value.
        */


}

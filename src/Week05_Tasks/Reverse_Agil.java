package Week05_Tasks;

public class Reverse_Agil {

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }


    public static String reverse(String input){
        // I create an empty String
        String output = "";
        // I convert the input string to an array of characters
        char [] characters = input.toCharArray();
        // Iterate through the characters in reverse order
        for (int i = characters.length-1; i >= 0; i--) {
            output += characters[i];
        }
        // Return the reversed string
        return output;
    }
}

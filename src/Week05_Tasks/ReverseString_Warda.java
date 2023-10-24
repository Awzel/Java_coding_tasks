package Week05_Tasks;

public class ReverseString_Warda {
        /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    // In order to get a reverse of a string, I can easily do this in three to four steps by using a reversed for i loop.
    public static void main(String[] args) {
        // For instance,  I will assume for the purpose of this interview, that I have a hardcoded String value of "ABCD"
        // and I am expected to get a reverse output of the string, Thus "DCBA"
        String str = "ABCD";
        // My first step would be to create an empty variable, to store my reverse String,
        // and I would leave it empty, so I can add my new
        String reverse = "";
        // My second step would be to create a for i loop, but instead of the traditional syntax I will customize it to reverse
        // So it would be,
        // take the total length -1 of my hardcoded string value,
        // and as long as the value is bigger than or equal to 0 continue the loop,
        // after each iteration, take away 1 for the index # ,
        for (int i = str.length() - 1; i >= 0; i--) {
            // within the loop would be my Third step,
            // From the hardcoded string value, I will get the char value at each index # represented by i of the loop.
            // Each of those char values will then be stored in an empty variable we made ins tep 1,
            reverse = "" + str.charAt(i);
            // Since I want to print each char values, I will create a print statement within the loop , allowing me to see each values
            // if I keep print statement outside it would only give me the very last value of the output, which would be A.
            // (( the reason I said three instead of 4 steps was because print statement can directly have our step 3 in it))
            System.out.print(reverse);

        }


    }

}

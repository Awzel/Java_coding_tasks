package Week05_Tasks;

public class ReverseString_Awzel {

    public static void main(String[] args) {

        System.out.println(reverseString("lazwa"));
        System.out.println(reverseString("arolef"));
    }

    public static String reverseString(String str){
        String reversal = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversal += str.charAt(i);
        }
        return reversal;
    }

}

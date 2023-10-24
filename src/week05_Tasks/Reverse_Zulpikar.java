package week05_Tasks;


/*

2.
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

 */
public class Reverse_Zulpikar {

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
        System.out.println(reverse("ABCDefghkjk1dfa"));
        System.out.println("---------------------------");

        System.out.println(reverse2("ABCD"));
        System.out.println(reverse2("ABCDefghkjk1dfa"));
        System.out.println("---------------------------");

        System.out.println(reverse3("ABCD"));
        System.out.println(reverse3("ABCDefghkjk1dfa"));
        System.out.println("---------------------------");

        System.out.println(reverse4("ABCD"));
        System.out.println(reverse4("ABCDefghkjk1dfa"));
        System.out.println("---------------------------");


    }


    public static String reverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;

    }

    public static String reverse2(String str) { // using recursion
        if (str.isEmpty()) {
            return str;
        }
        return reverse2(str.substring(1)) + str.charAt(0);
    }


    public static String reverse3(String str) {
        // using StringBuilder, but needs to convert the stringBuilder to a string using toString()
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();

        //return new StringBuilder(str).reverse().toString();
    }

    public static String reverse4(String str) {

        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

}

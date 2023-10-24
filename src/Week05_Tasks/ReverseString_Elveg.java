
package Week05_Tasks;

public class ReverseString_Elveg {
    public static void main(String[] args) {
        System.out.println(reverseString("aabbbbccccccd"));
    }

    public static String reverseString(String str){
        String strReturn = "";
        for (int i = str.length()-1; i >= 0; i--) {
            strReturn+=str.charAt(i);
        }
        return strReturn;
    }
}


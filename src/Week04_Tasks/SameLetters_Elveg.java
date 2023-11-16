package Week04_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SameLetters_Elveg {
    public static void main(String[] args) {

        System.out.println(sameLetter("acb","cda"));

    }

    public static boolean sameLetter(String str1, String str2){
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1,chars2);

        /*for(int i = 0; i<chars1.length; i++) {
            if(chars1[i]!=chars2[i]){
                return false;
            }
        }
        return true;*/
    }
}

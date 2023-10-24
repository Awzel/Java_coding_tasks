package Week04_Tasks;

import java.util.Arrays;
import java.util.Collections;

public class CharacterFrequency_Elveg {

    public static void main(String[] args) {
        System.out.println(uniqueCharacterFrequency("aaaabbbccddddddd"));
    }
    public static String uniqueCharacterFrequency(String strMain){
        String strReturn = "";
        for(int i = 0; i<uniqueCharacters(strMain).length();i++){
            strReturn+= ""+uniqueCharacters(strMain).charAt(i)+charFrequency(strMain,uniqueCharacters(strMain).charAt(i));
        }
        return strReturn;
    }

    public static String uniqueCharacters(String str){
        String strReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.contains(str.charAt(i)+"")&&!(strReturn.contains(str.charAt(i)+"")))
                strReturn += str.charAt(i);
        }
        return strReturn;
    }

    public static int charFrequency(String str, char c){
        return Collections.frequency(Arrays.asList(str.split("")),c+"");
    }
}

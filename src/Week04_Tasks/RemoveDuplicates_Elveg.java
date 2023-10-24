package Week04_Tasks;

public class RemoveDuplicates_Elveg {

    public static void main(String[] args) {
        System.out.println(removeDuplicateCharacters("aaaaadddssssssfggghhhl"));
    }
    public static String removeDuplicateCharacters(String str) {
        String strReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if (!strReturn.contains(str.substring(i,i+1)))
                strReturn += str.charAt(i);
        }
        return strReturn.trim();

    }
}

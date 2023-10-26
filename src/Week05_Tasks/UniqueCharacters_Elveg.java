package Week05_Tasks;

public class UniqueCharacters_Elveg {
    public static void main(String[] args) {

        System.out.println(uniqueCharacters("aaabbccccccccdeeeefgggh"));

    }

    public static String uniqueCharacters(String str) {
        String returnString = "";
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                returnString += c;
            }
        }
        return returnString;
    }
}

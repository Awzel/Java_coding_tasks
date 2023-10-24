package Week04_Tasks;

public class RemoveDuplicates_Nina {
    public static String rmDup(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }}return result;}
    public static void main(String args[]) {
        System.out.println(rmDup("AABBBBCCDD"));
    }
}


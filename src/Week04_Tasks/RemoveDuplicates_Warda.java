package src.Week04_Tasks;

public class RemoveDuplicates_Warda {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char eachletter = str.charAt(i);
            if (result.contains("" + eachletter)) {
                continue;
            } else {
                result += eachletter;

            }
        }

        System.out.println(result);


    }
}


package Week04_Tasks;

public class Character_Frequency_Kevin {
    //Write a return method that can find the frequency of
    //characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        String str = "AAABBCDD";
        char[] ch = str.toCharArray();
        int[] freq = new int[256];

        for (int i = 0; i < ch.length; i++) {
            freq[(int) ch[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println((char) i + " " + freq[i]);
            }
        }
    }
}

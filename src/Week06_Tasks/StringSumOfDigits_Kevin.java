package Week06_Tasks;

public class StringSumOfDigits_Kevin {
    public static void main(String[] args) {
        String input = "codingtask1234";
        int sum = calculateDigitSum(input);
        System.out.println("Sum of digits: " + sum);
    }

    public static int calculateDigitSum(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Convert the digit character to an integer and add it to the sum
                sum += Character.getNumericValue(currentChar);
            }
        }
        return sum;
    }
}
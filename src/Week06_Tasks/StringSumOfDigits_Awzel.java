package Week06_Tasks;

public class StringSumOfDigits_Awzel {

public static int sumOfDigits(String input){

   int sum = 0;

    for (int i = 0; i <input.length(); i++) {
        char each = input.charAt(i);

        if (Character.isDigit(each)){
            sum += Character.getNumericValue(each);
        }

    }
    return sum;
}

    public static void main(String[] args) {

        System.out.println(sumOfDigits("55abc55@!#$5"));

        System.out.println(sumDigits("2328hello00104"));

    }

    public static int sumDigits(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                sum += (c - '0');
            }
        }

        return sum;
    }

}
/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
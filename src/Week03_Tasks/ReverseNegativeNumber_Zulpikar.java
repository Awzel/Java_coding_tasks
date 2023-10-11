package Week03_Tasks;

/*
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
*/

public class ReverseNegativeNumber_Zulpikar {


    public static void main(String[] args) {
        int number1 = -12345789;
        System.out.println(reverseNegativeNumber(number1));

        int number2 = -54321;
        System.out.println(reverseNegativeNumber(number2));
    }

    public static int reverseNegativeNumber(int number) {
        number *= -1;
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10; // reverse = 0*10 + 123456789 % 10 = 9 --> reverse = 9*10 + 1234678 % 10 = 98 --> reverse = 98*10 + 1234567 %10 = 987 and so on...
            number = number / 10; // 123456789 / 10 = 12345678 --> 12345678 / 10 = 1234567 --> and so on
        }
        return -reverse;
    }


}

package Week01_Tasks;

public class OddOrEven {

    /*
    Write a method which can identify given number is odd or even
        EX:
        identify(5)-> "Odd"
        identify(6)-> "Even"
     */

    public static void main(String[] args) {

        System.out.println(OddOrEven(5));
        System.out.println(OddOrEven(6894));

    }

    public static String OddOrEven(int num) {
        if (num % 2 == 0) {
            return num + " is even";
        } else {
            return num + " is odd";
        }
    }
}


package Week01_Tasks;

public class DividewithoutOperator_Awzel {
    public static void main(String[] args) {

        oddOrEven(5);
        oddOrEven(6);
        oddOrEven(515);
        oddOrEven(815);
        oddOrEven(888);

    }

    static void oddOrEven(int number) {
        if (number % 2 == 0){
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + " is an even number");
        }
    }

}
 /*
    Write a method which can identify given number is odd or even
        EX:
        identify(5)-> "Odd"
        identify(6)-> "Even"
     */
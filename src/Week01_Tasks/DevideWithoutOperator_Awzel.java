package Week01_Tasks;

public class DevideWithoutOperator_Awzel {
    public static void main(String[] args) {

        System.out.println(divide(10,2));
        System.out.println(divide(-100,-10));
        System.out.println(divide(500,500));
        System.out.println(divide(-10,5)); // result != 2 smh

    }
    static int divide(int dividend, int divisor){


        if (divisor == 0){
            throw new ArithmeticException("Can't divide zero");
        }

        // we have to handle negative numbers since there won't be any ending to this
        // for example -1 -1 = -2, -2 -1 = -3, it will go to negative infinity

        if (dividend < 0){
            dividend = -dividend;
        }
        if (divisor < 0){
            divisor = -divisor;
        }

        // perform the division using repeated subtraction
        int quotient = 0;
        while (dividend >= divisor){
            dividend -= divisor;
            quotient++;
        }

        return quotient;
    }




}
/*
2. Numbers -- Divide without/operator

Write a method that can divide two numbers without using division operator
 */
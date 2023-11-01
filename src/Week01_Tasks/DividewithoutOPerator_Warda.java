package Week01_Tasks;

public class DividewithoutOPerator_Warda {
    public static void main(String[] args) {
        int dividend = 25;
        int divisor = 2;
        int count=0;

        while (dividend>divisor||dividend==divisor){
            count++;
            dividend=dividend-divisor;


        }

        System.out.println(count);

    }

/*2. Numbers -- Divide without/operator

Write a method that can divide two numbers without using division operator*/

/* COMPREHENSIVE ANSWER

System.out.println(divide(-50,5));

    }

    public static int divide(int dividend, int divisor){

        // first handle divisibility by 0
        if (divisor == 0){
            throw new ArithmeticException("Can't be divided by 0");
        }

        // we have to handle negative numbers since there won't be any ending to this
        // for example -1 -1 = -2. -2 -1 = -3, it will go to negative infinity

        if (dividend < 0 ){
            dividend = - dividend;
        }
        if (divisor < 0 ){
            divisor = - divisor;
        }

        // perform the division using repeated subtraction
        int quotient = 0;
        while (dividend >= divisor){
            dividend -= divisor;
            quotient++;
        }

        return quotient;*/
}

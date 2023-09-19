package src.Week01_Tasks;

public class Warda_DividewithoutOperator {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 5;
        int count=0;

        while (n1>n2||n1==n2){
            count++;
            n1=n1-n2;


        }

        System.out.println(count+" with a remainder of "+(n1));

    }
}
/*2. Numbers -- Divide without/operator

Write a method that can divide two numbers without using division operator*/


package Week02_Tasks;

public class PrintConsecutiveNumbers_Narmeen {

    public static void printConsecutiveNumbers(int n){

        for(int i=1;i<=n;i++){
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println("CodilityTestCoders");
            }else if(i%2==0 && i%3==0){
                System.out.println("CodilityTest");
            }else if(i%2==0 && i%5==0){
                System.out.println("CodilityCoders");
            }else if(i%3==0 && i%5==0){
                System.out.println("TestCoders");
            }else if(i%2==0){
                System.out.println("Codility");
            }else if(i%3==0){
                System.out.println("Test");
            }else if(i%5==0){
                System.out.println("Coders");
            }else{
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        printConsecutiveNumbers(24);
        printConsecutiveNumbers(100);

    }

}

/*
Write a function:
that, given a positive integer n, print the consecutive numbers between 1 ~ n, each on a new line. However, any number divisible by 2, 3, or 5 should be replaced by the word Codility, Test, or Coders, respectively. If a number is divisible by more than one of the numbers: 2, 3, or 5, it should be replaced by the word Codility, Test, or Coders, respectively in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by both 2 and 5 should be replaced by CodilityCoders. Numbers divisible by 2, 3, and 5 should be replaced by CodilityTestCoders.
 */
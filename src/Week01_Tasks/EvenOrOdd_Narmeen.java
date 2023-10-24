package Week01_Tasks;

public class EvenOrOdd_Narmeen {

    public static void main(String[] args) {

        System.out.println(evenOrOdd(-50));
        System.out.println(evenOrOdd(654321));
        System.out.println(evenOrOdd(6514568));
        System.out.println(evenOrOdd(91632));
        System.out.println(evenOrOdd(777));

    }

    static String evenOrOdd(int num){

        if(num%2==0){
            return num + " is an even number";
        }else{
            return num + " is an odd number";
        }

    }

}

/*
Numbers -- odd & even
Write a method which can identify given number is odd or even

EX:
   identify(5)-> "Odd"
   identify(6)-> "Even"
 */
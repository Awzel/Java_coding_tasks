package src.Week01_Tasks;

public class FINRA_Alina {
    public static void main(String[] args) {
        Finra();


    }

    public static void Finra() {
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }

        }
    }
}
/*
3.FINRA :
  Write a method which prints out the numbers from 1 to 30 but for numbers which
  are a multiple of 3print "FIN" instead of the number and for numbers which are a
  multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
  both 3 and 5, print "FINRA" instead of the number
 */
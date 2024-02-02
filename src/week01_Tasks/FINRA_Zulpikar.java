package week01_Tasks;

public class FINRA_Zulpikar {

    /*
    FINRA :
  Write a method which prints out the numbers from 1 to 30 but for numbers which
  are a multiple of 3 print "FIN" instead of the number and for numbers which are a
  multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
  both 3 and 5, print "FINRA" instead of the number
     */

    public static void main(String[] args) {

        printFINRA();
        System.out.println();
        printFINRA2();
    }

    public static void printFINRA() {

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN");
            } else if (i % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(i);
            }
        }

    }


    public static void printFINRA2() {

        for (int i = 1; i <= 30; i++) {
            String print = "";

            if (i % 3 == 0) print = "FIN";
            if (i % 5 == 0) print += "RA";

            if (print.isEmpty()) {
                System.out.print(i);
            } else {
                System.out.print(print);
            }
        }
    }
}

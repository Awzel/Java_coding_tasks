package week2;

public class SwapNumbers_Sabina {

    //Swap two variable' values without using a third variable

    public static void main(String[] args) {

        swap_two_values(5,2);

        // swap_two_values((-5),2);

       // swap_two_values((-5),(-2));


    }

    public static void swap_two_values(int a, int b){

        System.out.println("Before swap: a = " + a + ", b = " + b);

        //Positive numbers scenario
        a = a + b; // a = 5 + 2 = 7
        b = a - b;// b = 7 - 2 = 5
        a = a - b; // a = 7 - 5 = 2



        //Negative numbers Scenario
        /*        a = a + b; // a = -5 + -2 = -7
                b = a - b;// b = -7 - (-2) = -5
                a = a - b; // a = -7 - (-5) = -2
         */

        //One positive, one negative
        /*   a = a + b; // a = -5 + 2 = -3
        b = a - b;// b = -3 - 2 = -5
        a = a - b; // a = -3 - (-5) = 2
                   //     -3 + 5 = 2
      */

        System.out.println("After swap: a = " + a + ", b = " + b);
    }






























  /*  public static void swap_two_values_collectionMethod(int a, int b){

        // Create a List to hold the variables you want to swap
        List<Integer> variableList = new ArrayList<>();

        // Add the variables to the List
        variableList.add(a);
        variableList.add(b);

        // Print the initial values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Use Collections.swap to swap the values
        Collections.swap(variableList, 0, 1);

        // Extract the swapped values from the List back into variables
        a = variableList.get(0);
        b = variableList.get(1);

        // Print the swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

   */


}

package Week02_Tasks;

public class SwapNumbers_Narmeen {

    public static void swapVariables(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        swapVariables(10, 20);

    }



}
/*
  Swap two variable's values without using a third variable

 */
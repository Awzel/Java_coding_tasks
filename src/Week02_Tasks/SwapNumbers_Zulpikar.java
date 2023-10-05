package Week02_Tasks;

public class SwapNumbers_Zulpikar {

    // Swap two variable values without using a third variable

    public static void main(String[] args) {

        SwapNumbers(10,78);
        SwapNumbers(1,4);

    }

    private static void SwapNumbers(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


}

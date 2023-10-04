package Week02_Tasks;

public class SwapNumbers_Elveg {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 45;
        swapNumbers(n1,n2);
    }

    public static void swapNumbers(int n1, int n2){
        /*Mathematical explanation:
        n1=n1+n2, Important step for later

        n2=n1-n2, but we know that n1=n1+n2 from above, so we can replace n1 with n1+n2, so n2=n1+n2-n2=n1 so n2=n1

        n1=n1-n2, but we know that n2=n1-n2 from above, so we can replace n2 with n1-n2, so n1=n1-(n1-n2)=n1-n1+n2=n2 so n1=n2
         */
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println(n1 + "," + n2);
    }
}

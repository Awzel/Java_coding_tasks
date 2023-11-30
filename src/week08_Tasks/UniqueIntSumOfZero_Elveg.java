package week08_Tasks;

import java.util.Arrays;

public class UniqueIntSumOfZero_Elveg {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            int[] arr = sumOfUniqueInt(85);
            System.out.println("-----------------------");
            System.out.println(Arrays.toString(arr));
            System.out.println(sumOfArrayInts(arr));
            //System.out.println(checkDuplicates(arr));
            System.out.println("-----------------------");
        }
    }

    public static int[] sumOfUniqueInt(int N) {
        int[] arr = new int[N];
        int x = (int) (Math.random() * 2 * N - N);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                x = -sumOfArrayInts(arr);
                if(x==0){
                    break;
                }
                for (int j = 0; j < arr.length; j++) {
                    if (checkIfInArray(arr, x) && i != 0) {
                        i--;
                        break;
                    }
                    if(x==arr[j]){
                        arr[j]--;
                        x++;
                        break;
                    }
                }
            }
            while (checkIfInArray(arr, x)) {
                x = (int) (Math.random() * 2 * N - N);
                }
            arr[i] = x;

        }

        return arr;
    }

    public static boolean checkIfInArray(int[] arr, int x) {
        for (int i1 : arr) {
            if (x == i1) {
                return true;
            }
        }
        return false;
    }

    /*public static boolean checkDuplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {

        }
        return false;
    }*/


    public static int sumOfArrayInts(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /*

    Sum(N) = 0

    n1+n2+n3+n4=0

    n1 = x is member of Z;

    x+n2+n3+n4
    x(1+

    x+(Random(x))+(Random(x))

     */

}

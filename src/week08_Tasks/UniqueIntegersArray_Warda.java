package week08_Tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueIntegersArray_Warda {
    public static void main(String[] args) {
        System.out.println("uniqueSumArray(4) = " + Arrays.toString(uniqueArray(4)));


    }

    public static int[] uniqueArray(int n){
        int[] result = new int[n];
        int sum = 0;
        Random random = new Random();
        Set<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            int num;
            do {
                num = random.nextInt(10) * (random.nextBoolean() ? 1 : -1);

            } while (uniqueSet.contains(num));
            uniqueSet.add(num);
            result[i] = num;
            sum += num;
        }

        result[n - 1] = -sum;
        return result;


    }
}

package week08_Tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueIntSumUpZero_Sabina {

    public static void main(String[] args) {
        int N = 5;
        int[] uniqueSum = uniqueSumArray(N);
       // System.out.println(Arrays.toString(uniqueSum));

        //System.out.println(Arrays.toString(generateArray(N)));

        System.out.println(Arrays.toString(generateUniqueArray(N)));
    }

    public static int[] uniqueSumArray(int N) {
        int[] result = new int[N];
        int sum = 0;
        Random random = new Random();
        Set<Integer> uniqueSet = new HashSet<>();

        for (int i = 0; i < N - 1; i++) {
            int num;
            do {
                num = random.nextInt(200) - 100;
            } while (uniqueSet.contains(num));
            uniqueSet.add(num);
            result[i] = num;
            sum += num;
        }

        result[N - 1] = -sum;
        return result;
    }

    public static int[] generateArray(int N) {
        // Validate input
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N should be between 1 and 99");
        }

        int[] result = new int[N];

        // Populate the array with N-1 random integers
        Random random = new Random();
        for (int i = 0; i < N - 1; i++) {
            int randomInt = random.nextInt(200) - 100; // Generate random integers between -100 and 99
            result[i] = randomInt;
        }

        // Calculate the last element to ensure the sum is zero
        int sum = Arrays.stream(result).sum();
        result[N - 1] = -sum;

        return result;
    }

    public static int[] generateUniqueArray(int N){
        Random random = new Random();

        int[] result = new int[N];

        Set<Integer> unique = new HashSet<>();
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < result.length-1; i++) {

           do{
               temp = random.nextInt(10)-5;
               unique.add(temp);
           }while(!(unique.contains(temp)));{
            result[i] = temp;
            sum += temp;
           }

            }
        result[result.length-1] = sum;
        System.out.println("unique = " + unique);


        return result;
        }






}

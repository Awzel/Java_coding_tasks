package week08_Tasks;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
* Q1.
    Array - N unique integers that sum up to 0
    Write a function that, given an integer N (1 < N < 100), returns an array
    containing N unique integers that sum up to 0. The function can return any
    such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more
    correct answers).
* */
public class SumUpToZero_Zulpikar {

    public static void main(String[] args) {

        System.out.println("Arrays.toString(uniqueSumArray(20)) = " + Arrays.toString(uniqueSumArray(20)));
        // to make sure we have the correct answer
        int sum = Arrays.stream(uniqueSumArray(20)).sum();
        System.out.println(sum);


    }

    public static int[] uniqueSumArray(int N) {
        int[] result = new int[N]; // Create an array of size N
        int sum = 0;
        Random random = new Random(); // Create a Random object
        Set<Integer> uniqueSet = new HashSet<>(); // Create a Set object to store unique elements

        for (int i = 0; i < N - 1; i++) {
            int num;
            do {
                // num = random.nextInt(10) * (random.nextBoolean() ? 1 : -1);
                num = random.nextInt(200) - 100;
            } while (uniqueSet.contains(num));
            uniqueSet.add(num);
            result[i] = num;
            sum += num;
        }

        result[N - 1] = -sum;
        return result;
    }

}


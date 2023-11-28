package week08_Tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueIntegersArray {
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
                //  random.nextInt(200)-100; to control the range
            } while (uniqueSet.contains(num));
            uniqueSet.add(num);
            result[i] = num;
            sum += num;
        }

        result[n - 1] = -sum;
        return result;


    }
}
/*
First I would create a variable of all the things I need to do the test
That would be arrayed, sum , random class obj, hashset obj
Then I will do a loop based on the length of my parameter defined in the method
I will create a variable called num, along with a do while statement
do : get me random number upto 10, multiply with random boolean answer with either 1 or -1
while : hashset contains the number we just generated
otherwise
add the number to hashset , and add it to the array at index number of an i, also add the number to sum variable
after the loop is done at the last index # of the array , take total sum * -1
 */
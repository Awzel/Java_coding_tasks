package week09_Tasks;

import java.util.ArrayList;
import java.util.List;


/*
3) ArrayList - Remove values
Given a list of Integers 1,2,3,4,5,6 ... etc. remove all values grater than 100.
* */

public class RemoveValues_Zulpikar {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,101,203,405,334));
        System.out.println("Before removal: " + numbers);

        removeValues(numbers);
        System.out.println("After removal: " + numbers);

    }

    public static void removeValues(List<Integer> integerList){
        integerList.removeIf(n -> n > 100);
    }
}
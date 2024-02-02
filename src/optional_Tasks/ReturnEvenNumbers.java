package optional_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReturnEvenNumbers {

    public static void main(String[] args) {
        System.out.println(returnEvenNumbers());
    }


    public static List<Integer> returnEvenNumbers() {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            int num = it.next();
            if (num % 2 != 0) {
                it.remove();
            }
        }
        return list;
    }


}

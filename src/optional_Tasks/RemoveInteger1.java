package optional_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveInteger1 {

    public static void main(String[] args) {
        System.out.println(remove1());
    }

    public static List<Integer> remove1() {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,4,5,6,7,8,1,1,1,1));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())

        {
            int num = it.next();
            if (num == 1) {
                it.remove();
            }
        }
        return list;
    }

}

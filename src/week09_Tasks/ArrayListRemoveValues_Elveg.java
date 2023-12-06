package week09_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListRemoveValues_Elveg {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        removeValue(arrayList);
        System.out.println(arrayList);
    }

    public static void removeValue(ArrayList<Integer> arrayList) {
        arrayList.removeIf(p -> p>2);
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next()>2){
                iterator.remove();
            }
        }

    }

}

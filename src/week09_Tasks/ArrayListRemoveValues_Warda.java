package week09_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveValues_Warda {
    public static void main(String[] args) {
        /*
        ArrayList :
        given a list of integers 1,2,3,4,5, remove all values more than 100
         */
        // option #1
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(1, 200, 3, 4, 50, 6, 7, 800, 9, 10));
        arrayList.removeIf(p -> p>=100);
        System.out.println(arrayList);

        //option#2
        ArrayList<Integer> arrayList2 = new ArrayList(Arrays.asList(1, 200, 3, 4, 50, 6, 7, 800, 9, 10));
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        for (Integer eachElement : arrayList2) {
            if(eachElement<100){arrayList3.add(eachElement);}
        }
        System.out.println(arrayList3);


    }
}

package week10_Tasks;

import java.util.ArrayList;

public class ArrayListSortingInDesc_Warda {


    public static void main(String[] args) {

    }


    public static ArrayList<Integer> descendingOrderArrayList(ArrayList<Integer> arrayList){
        int length = arrayList.size();
        for (int i = 0; i < length - 1; i++) {
            for (int h = 0; h < length - i - 1; h++) {
                if (arrayList.get(h) < arrayList.get(h + 1)) {
                    int tempStorage = arrayList.get(h);
                    arrayList.set(h, arrayList.get(h + 1));
                    arrayList.set(h + 1, tempStorage);
                }
            }
        }



        return arrayList;
    }

}
    /*
    Inner Loop line:
 shifting the i to the end of the loop of h, by reducing the length of inner look at each outer loop
     */

package week10_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

/*
ArrayList - sorting in ascending.
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
* */
public class SortInAscending_Zulpikar {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
        System.out.println("Before sorting: " + list);
        sortAscending(list);
        System.out.println("After sorting:  " + list);

        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 23, 13, 45, 78, 9));
        System.out.println("Before sorting: " + list2);
        sortAscending(list2);
        System.out.println("After sorting:  " + list2);
    }

    public static void sortAscending(ArrayList<Integer> list) {

        int n = list.size();

        for (int i = 0; i < n - 1; i++) { // represents the number of iterations to ensure the list is fully sorted.
            // n-1 is because we are comparing pairs, and the last one does not have a pair.

            for (int j = 0; j < n - 1 - i; j++) { // represents each pass over the list.
                // in each full pass, the largest element will fall to its correct place

                if (list.get(j) > list.get(j + 1)) {
                    // swap elements at index j and j+1
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}

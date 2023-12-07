package week10_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSortingInAsc_Sabina {
    /**
     * ArrayList - sorting in ascending
     * Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,8,3,-5,4,7,9,2));
        System.out.println("sortAsc(nums) = " + sortAsc(nums));
        System.out.println("sortAsc2(nums) = " + sortAsc2(nums));

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a','f','b','y'));
        System.out.println("sortAsc3(characters) = " + sortAsc3(characters));
        System.out.println("sortAsc4(characters) = " + sortAsc4(characters));


    }

    public static ArrayList<Integer> sortAsc(ArrayList<Integer> nums){

        ArrayList<Integer> numbers = new ArrayList<>(nums);

        ArrayList<Integer> result = new ArrayList<>();

        while (!numbers.isEmpty()){

            int min = numbers.get(0);

            for (Integer current : numbers) {
                if (current < min){
                    min = current;
                }
            }
            result.add(min);
            numbers.remove(numbers.indexOf(min));
            }

        return result;
    }

    public static ArrayList<Integer> sortAsc2(ArrayList<Integer> nums){

        ArrayList<Integer> numbers = new ArrayList<>(nums);

        ArrayList<Integer> result = new ArrayList<>();

        while(!numbers.isEmpty()) {
            int min = Collections.min(numbers);
            result.add(min);
            numbers.remove(numbers.indexOf(min));
        }

        return result;
    }


    public static ArrayList<Character> sortAsc3(ArrayList<Character> characters){

        ArrayList<Character> copy = new ArrayList<>(characters);

        ArrayList<Character> result = new ArrayList<>();

        while (!copy.isEmpty()){

            char min = copy.get(0);

            for (Character current : copy) {
                if (current < min){
                    min = current;
                }
            }
            result.add(min);
            copy.remove(copy.indexOf(min));
        }

        return result;

    }

    public static List<Character> sortAsc4(ArrayList<Character> characters) {

        List<Integer> copy = new ArrayList<>();

        for (char c : characters) {
            copy.add((int) c);
        }

        ArrayList<Character> result = new ArrayList<>();
        
        while(!copy.isEmpty()) {
            int min = Collections.min(copy);
            result.add((char) min);
            copy.remove(copy.indexOf(min));
        }

        
        
        return result;
    }


}

package week10_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSortingInDesc_Sabina {
    /**
     * ArrayList - sorting in descending order
     * Write a method that can sort the ArrayList in descending order without using the sort method.
     */

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,8,3,-5,4,7,9,2));
        System.out.println(sortDesc(nums));
        System.out.println(sortDesc2(nums));


        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a','f','b','y'));
        System.out.println(sortDesc3(characters));
        System.out.println(sortDesc4(characters));


    }

    public static List<Integer> sortDesc(List<Integer> nums){

        List<Integer> copy = new ArrayList<>(nums);

        List<Integer> result = new ArrayList<>();

        while(!copy.isEmpty()){

            int max = copy.get(0);

            for (Integer each : copy) {
                if (each > max){
                    max = each;
                }
            }
            result.add(max);
            copy.remove(copy.indexOf(max));

        }



        return result;
    }

    public static List<Integer> sortDesc2(List<Integer> nums) {

        List<Integer> copy = new ArrayList<>(nums);

        List<Integer> result = new ArrayList<>();

        while (!copy.isEmpty()){
            int max = Collections.max(copy);
            result.add(max);
            copy.remove(copy.indexOf(max));
        }

        return result;
    }

    public static List<Character> sortDesc3(List<Character> characters) {
        List<Character> copy = new ArrayList<>(characters);

        List<Character> result = new ArrayList<>();

        while(!copy.isEmpty()){

            char max = copy.get(0);

            for (Character each : copy) {
                if (each > max){
                    max = each;
                }
            }
            result.add(max);
            copy.remove(copy.indexOf(max));

        }



        return result;
    }

    public static List<Character> sortDesc4(List<Character> characters) {
        List<Integer> copy = new ArrayList<>();

        for (char character : characters) {
            copy.add((int)character);
        }

        List<Character> result = new ArrayList<>();


        while (!copy.isEmpty()){
        int max = Collections.max(copy);
        result.add((char)max);
        copy.remove(copy.indexOf(max));

        }



        return result;
    }




}

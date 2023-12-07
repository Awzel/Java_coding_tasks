package week09_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveValues_Sabina {
    //ArrayList - Remove "Ahmed"
    //Given a list of people' names: "Ahmad", "John", "Eric", "Ahmad"......
    //Write a java operation to remove all the names named Ahmed

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmad", "John", "Eric", "Ahmad", "Sandra"));
        String removed = "Ahmad";
        System.out.println(removeValueFirst(names,removed));

        System.out.println("------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,4,5,6,7,4,4,4,3,4));
        Integer remove = 4;
        System.out.println(removeValuesSecond(nums, remove));
    }

    public static ArrayList<String> removeValueFirst(ArrayList<String> str, String removedValue){
        ArrayList<String> result = new ArrayList<>();
        str.removeIf(p-> p.equals(removedValue));
        result = str;
        return result;
    }

    public static ArrayList<Integer> removeValuesSecond(ArrayList<Integer> nums, Integer removedValue){

        //have to use iterator;
        return new ArrayList<>();
    }

}

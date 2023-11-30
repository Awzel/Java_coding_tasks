package week09_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 2) ArrayList - Remove "Ahmed"
Given a list of peoples' names: "Ahmad", "John", "Eric", "Ahmad"......
Write a java operation to remove all the names named Ahmed
* */

// Arrays are used in Java for a performance edge in specific scenarios, but this code isn't one of them.
// It is best to use ArrayList or Set, which are more appropriate.

public class RemoveAhmed_Zulpikar {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(Arrays.asList("Ahmad", "John", "Eric", "Ahmad"));
        System.out.println(removeAhmed(namesList));
    }

    public static List<String> removeAhmed(List<String> names) {
        List<String> updatedNames = new ArrayList<>();
        for (String name : names) {
            if (!name.equals("Ahmad")) {
                updatedNames.add(name);
            }
        }
        return updatedNames;
    }
}

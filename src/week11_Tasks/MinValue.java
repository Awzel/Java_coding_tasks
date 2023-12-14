package week11_Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
    Map - Min values
    Write a method that can return the minimum value from a map (DO NOT
    use sort method).
* */
public class MinValue {

    public static void main(String[] args) {

    }

    public static Integer findMinValue(Map<String, Integer> map) {

        //Creates a list of Map.Entry objects from the input map.
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Integer min = Integer.MAX_VALUE; // largest value in Java
        for (Map.Entry<String, Integer> each : list) {
            if(each.getValue()<min) {
                min= each.getValue();
            }
        }
        return min;
    }
}

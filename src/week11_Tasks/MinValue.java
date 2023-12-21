package week11_Tasks;

import java.util.*;

/*
    Map - Min values
    Write a method that can return the minimum value from a map (DO NOT
    use sort method).
* */
public class MinValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("findMinValue(map) = " + findMinValue(map)); // Output: 1
        System.out.println("getMinValue(map) = " + getMinValue(map)); // Output: 1
        System.out.println("getMinValueJava8(map) = " + getMinValueJava8(map));
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


    public static Integer getMinValue(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        int min = iterator.next(); // Initialize with the first value

        while (iterator.hasNext()) {
            int nextValue = iterator.next();

            if (min > nextValue) {
                min = nextValue;  // Update minimum when a smaller value is found
            }
        }

        return min;
    }

    public static int getMinValueJava8(Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .min((Map.Entry.comparingByValue()))
                .get()
                .getValue();
    }
}

package week10_Tasks;

import java.util.*;

public class SortMapByValues_Sabina {

    /**
     * Map - Sort the map by values
     * Write a method that can sort the Map by values.
     */
    public static void main(String[] args) {
        Map<String, String> words = new LinkedHashMap<>();
        words.put("1", "dcb");
        words.put("2", "abc");
        words.put("3", "xyz");
        words.put("4", "klm");

        Map<String, String> result = new LinkedHashMap<>();

        List<String> values = new ArrayList<>(words.values());

        Collections.sort(values);
        System.out.println("values = " + values);

      /*  while (values.iterator().hasNext()){
            for (String value : values) {
                System.out.println("value = " + value);
                for (int i = 0; i < value.length(); i++) {

                        char char1 = values.get(i + 1).charAt(i);
                        char char2 = value.charAt(i);
                        if ((int)char1 < (int)char2){

                        }

                }
            }
        }

       */

        System.out.println(sortTheMapByValue(words));

        Map<Integer, Integer> nums = new LinkedHashMap<>();
        nums.put(4, 7);
        nums.put(5, 4);
        nums.put(6, 9);
        nums.put(7, 0);
        //System.out.println("nums = " + nums);
        //System.out.println(sortTheMapByValueInt(nums));
        System.out.println("nums.keySet() = " + nums.keySet());

    }

    public static Map<Integer, Integer> sortTheMapByValueInt(Map<Integer, Integer> nums) {
        Map<Integer, Integer> result = new HashMap<>(nums);

        ArrayList<Integer> copy = new ArrayList<>(nums.values());

        //Collections.sort(copy);
        copy = ArrayListSortingInAsc_Sabina.sortAscInt(copy);
        System.out.println("copy = " + copy);

        for (Integer key : result.keySet()) {
            result.put(key, copy.get(key - 1));
        }
        //result.put(key, copy.get(key - 1)); why key -1?

        return result;
    }


    public static Map<String, String> sortTheMapByValue(Map<String, String> map){
        Map<String, String> result = new LinkedHashMap<>();

        Map<String, String> copy = new LinkedHashMap<>(map);

        List<String> values = new ArrayList<>(copy.values());

        for (String value : values) {
        }


        return result;
    }

}
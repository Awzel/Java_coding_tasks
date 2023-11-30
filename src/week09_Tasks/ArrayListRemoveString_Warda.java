package week09_Tasks;

import java.util.ArrayList;

public class ArrayListRemoveString_Warda {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmad");
        names.add("John");
        names.add("Eric");
        names.add("Ahmad");

        System.out.println(removeName(names,"Ahmad"));


    }

    public static ArrayList<String> removeName(ArrayList<String> arr, String name){
        ArrayList<String> names2 = new ArrayList<>();

        for (String eachName : arr) {
            if (!(eachName.equals(name))) {
                names2.add(eachName);   }


        }
        return names2;




    }




}

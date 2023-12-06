package week09_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListRemove_Elveg {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList(Arrays.asList("Ahmad", "John", "Eric", "Ahmad"));
        ArrayList<String> arrayList2 = new ArrayList(Arrays.asList("Ahmad", "John", "Eric", "Ahmad"));
        removeName(arrayList, "Ahmad");
        System.out.println(arrayList);
    }

    public static void removeName(ArrayList<String> arrayList, String name){
        //arrayList.removeIf(p -> p.equals(name));
        //Iterator<String> iterator = arrayList.iterator();
        /*while(iterator.hasNext()){
            if(iterator.next().equals(name)){
                iterator.remove();
            }
        }*/
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).equals(name))
                arrayList.remove(i);
        }
    }
}

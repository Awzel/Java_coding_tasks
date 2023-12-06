package week09_Tasks.w9_solutions;

import java.util.*;

public class W9_RemoveAhmed {
    public static void main(String[] args) {
/*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/

        //solution 1
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names.removeAll(List.of("Ahmed"));
        System.out.println(names);


        //solution2
        List<String> names2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        for (ListIterator<String> it = names2.listIterator(); it.hasNext(); )
            if (it.next().equals("Ahmed"))
                it.remove();
        System.out.println(names2);


        //solution3
        List<String> names3 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        List < String > names4 = new ArrayList<>();
        names3.forEach(p -> { if (!p.equals("Ahmed")) names4.add(p);        });
        System.out.println(names4);

        //solution4
        List<String> names5 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        Iterator<String> it = names5.iterator();
        while(it.hasNext()) {
            if(it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println( names5 );
    }
}
/*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed

   */
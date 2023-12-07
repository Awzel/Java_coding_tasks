package Week05_Tasks;

import java.util.ListIterator;
import java.util.Vector;

public class ReverseString_Sabina {


    public static void main(String[] args) {


    /*    // creating a vector of String type
        Vector<String> numbers = new Vector<String>();

        // adding elements to vector
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");

        System.out.println(numbers);

        // listIterator method will return the list of
        // String of type ListIterator.
        ListIterator<String> listIterator
                = numbers.listIterator(numbers.size());

        // Iterate the ListIterator using the hasPrevious()
        // method

        while (listIterator.hasPrevious()) {

            // if element exist at previous index,then print
            // that element
            System.out.println(listIterator.previous());

        }
     */



        String str = "abcd";
        System.out.println("reverseStringMsg(str) = " + reverseStringMsg(str));


    }

    public static void reverseString(String str) {
        // creating a vector of String type
        Vector<String> text = new Vector<String>();

        // adding elements to vector
        text.add(str);


        // listIterator method will return the list of
        // String of type ListIterator.
        ListIterator<String> listIterator = text.listIterator(text.size());

        // Iterate the ListIterator using the hasPrevious() method

        while (listIterator.hasPrevious()) {

            // if element exist at previous index,then print that element
            System.out.println(listIterator.previous());
        }
    }

    public static String reverseStringMsg(String str){

        String outcome = "";

        for (int i = str.length() -1; i >= 0; i-- ){
            outcome += str.charAt(i);
        }

        return outcome;
    }

    public static String reverseString2(String str){

        char[] reversed = str.toCharArray();

        int start = 0;
        int end = reversed.length - 1;

        while (start < end){
            char temp = reversed[start];
            reversed[start] = reversed[end];
            reversed[end] = temp;

            start = start + 1;
            end = end - 1;
        }

        return reversed.toString();
    }








}

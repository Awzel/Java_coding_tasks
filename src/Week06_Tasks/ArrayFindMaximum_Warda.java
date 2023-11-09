package Week06_Tasks;

public class ArrayFindMaximum_Warda {
    //Write a method that can find the maximum number from an int Array
    public static int maxNumberOfArray(int[] arrays){
        if (arrays.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maxnumber = 0;

        for (int eacharray : arrays)
            if (eacharray >= maxnumber) {
                maxnumber = eacharray;
            }
        return maxnumber;
    }
/* ***************************************************************************************************** */
    public static void main(String[] args) {
        int[] myarray ={200,50000,90,16,70};
        System.out.println("maxNumberOfArray is = " + maxNumberOfArray(myarray));





    }
}

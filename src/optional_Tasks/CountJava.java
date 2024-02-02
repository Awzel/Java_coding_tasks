package optional_Tasks;


/*
* Write a program that will count how many times “java”is found in any given String:
* */
public class CountJava {

    public static void main(String[] args) {

        countJava1("Kacdefajavageceiyokkijava sayisini javada say");
        countJava2("Kacdefajavageceiyokkijava sayisini javada say");
        System.out.println();
        countJava1("burada java yazdik ki Java kacta gesiyor bul ve java sayisini yazdir");
        countJava2("burada java yazdik ki Java kacta gesiyor bul ve java sayisini yazdir");
    }

    public static void countJava1(String str){

        int counter = 0;
        for (int i = 0; i <= str.length()-4; i++){
            if (str.substring(i, i+4).equalsIgnoreCase("java")){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void countJava2(String str){

        int counter = 0;
        str = str.toLowerCase();

        while (str.contains("java")){
            counter++;
            str = str.replaceFirst("java", "");
        }
        System.out.println(counter);
    }

}

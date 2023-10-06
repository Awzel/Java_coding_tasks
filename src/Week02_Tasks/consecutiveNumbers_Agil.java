package Week02_Tasks;

public class consecutiveNumbers_Agil {

        public static void main(String[] args) {


            consNumbers(24);
        }

        public static void consNumbers( int num){


            for (int i = 1; i <= num; i++) {
                //   System.out.println(i);
                if(i%30==0){
                    System.out.println("Codility"+ "Test" + "Coders");
                }else if(i%15==0){
                    System.out.println("Test" + "Coders");
                }else if(i%6==0){
                    System.out.println("Codility" + "Test");
                }  else if(i%5==0){
                    System.out.println("Coders");
                }else if(i%3==0){
                    System.out.println("Test");
                }else if(i%2==0){
                    System.out.println("Codility");

                } else {
                    System.out.println(i);

                }

            }



        }
    }


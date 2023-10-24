package Week02_Tasks;

public class PrintConsecutiveNumbers_Elveg {
    public static void main(String[] args) {
        String str ="";
        int N = 100;
        for(int i = 1; i<=N; i++){
            if(i%2==0){
                str+="Codility";
            }if (i%3==0) {
                str+="Test";
            }if (i%5==0) {
                str+="Coders";
            }if(!((i%2==0)||(i%3==0)||(i%5==0))){
            str+=i;}
            System.out.println(str);
            str="";
            }
        }
    }


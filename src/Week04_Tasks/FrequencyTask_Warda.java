package src.Week04_Tasks;

public class FrequencyTask_Warda {
    public static void main(String[] args) {
        /*
        String -- Frequency of Characters
        Write a return method that can find the frequency of
        characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

         */

        String str = "AAABBCDD";
        String result = "";


        /*Map<Character,Integer> counter = new HashMap<>();
        // key is each char and the value is the frequency
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if(!counter.containsKey(eachChar)){
                counter.put(eachChar,1);} else {
                counter.put(eachChar,counter.get(eachChar)+1);
            }

        }
        System.out.println(counter);*/



        for (int i = 0; i < str.length(); i++)
        {
            char eachletter = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==str.charAt(i))
                {count++;}
                }
            if(result.contains(""+eachletter)) {continue;}

            result += (eachletter + "" + count);
         }
        System.out.print(result);







    }


  }


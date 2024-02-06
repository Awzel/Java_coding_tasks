package review_Tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class JavaReview {

    @Test
    public void test1() {

        System.out.println(printFINRA());

        System.out.println(countJava("java is fun. java is cool. java is great."));
        System.out.println(countJava2("java is fun. java is cool. java is great."));

        System.out.println(isPalindrome("rotator"));
        System.out.println(isPalindrome2("rotator"));
        System.out.println(isPalindrome3("rotator"));
        System.out.println(isPalindrome4("rotator"));

        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram2("listen", "silent"));
        System.out.println(isAnagram3("listen", "silent"));

        System.out.println(isValidPassword("Password123!"));
        System.out.println(isValidPassword2("Password123!"));

        System.out.println(removeDuplicates("aabbccddeeffgghh"));

        System.out.println(uniqueChars("aabbccddeeffgghh"));
        System.out.println(uniqueChars2("aabbccddeeffgghh"));
        System.out.println(uniqueChars3("aabbccddeeffgghh"));
        System.out.println(uniqueChars4("aabbccddeeffgghh"));

        System.out.println(sortAlphanumeric("a1b2c3d4e5f6g7h8i9j0"));

        System.out.println(maxNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(maxNumber2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(maxNumber3(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(maxNumber4(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

        System.out.println(minNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(minNumber2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(minNumber3(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(minNumber4(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

        System.out.println(Arrays.toString(sortAscending(new int[]{10, 9, 8, 7, 6, 3, 4, 8, 6, 2, 1})));
        System.out.println(Arrays.toString(sortAscending2(new int[]{10, 9, 8, 7, 6, 3, 4, 8, 6, 2, 1})));

        System.out.println(Arrays.toString(sortDescending(new int[]{10, 9, 8, 7, 6, 3, 4, 8, 6, 2, 1})));
        System.out.println(Arrays.toString(sortDescending2(new int[]{10, 9, 8, 7, 6, 3, 4, 8, 6, 2, 1})));

        System.out.println(primeNumbers(100));

        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong2(153));

        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome2(12321));
        System.out.println(isPalindrome3(12321));
        System.out.println(isPalindrome4(12321));

        swap(5, 10);
        swap2(5, 10);

        divisibleBy3_5_15();



        System.out.println(sumNumbersInString("abc123def45gh6i")); // 174
        System.out.println(isArmstrong(153)); // true
    }


    // Q1
    /* Write a program that prints the numbers from 1 to 30 but for numbers which are a multiple of 3 print "FIN"
    instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number
    */
    public String printFINRA() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sb.append("FINRA");
            } else if (i % 3 == 0) {
                sb.append("FIN");
            } else if (i % 5 == 0) {
                sb.append("RA");
            } else {
                sb.append(i);
            }
        }
        return sb.toString();
    }


    // Q2
    /* Write a program that will count how many times "java" is found in any given String */
    // solution 1
    public int countJava(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 4).equalsIgnoreCase("java")) {
                count++;
            }
        }
        return count;
    }

    // solution 2
    public int countJava2(String str) {
        int count = 0;
        while (str.contains("java")) {
            count++;
            str = str.replaceFirst("java", "");
        }
        return count;
    }


    // Q3
    /* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases */
    // solution 1
    public boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // remove all non-alphanumeric characters
        // "[^a-zA-Z0-9]" means any character that is not a letter or a number

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // solution 2
    public boolean isPalindrome2(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    // solution 3
    public boolean isPalindrome3(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = str.length();
        for (int i = 0; i < n / 2; i++) { // if the length is odd, the middle character is not compared
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // solution 4 - reverse the string and compare
    public boolean isPalindrome4(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equals(str);
    }


    // Q4
    /* Create a program that will take any String and print the total sum of all the numbers in the String.
       Note: Numbers can be more than digits from 1-9, so if you have “14” next to each other, it should be considered 14 and not 1 and 4 separate.
     */
    // solution 1
    public int sumNumbersInString(String input) {
        int sum = 0;
        String num = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                num += ch;
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }


    // Q5
    /* Given two Strings determine if they are anagrams of each other */
    // solution 1
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            str2 = str2.replaceFirst(str1.charAt(i) + "", "");
        }
        return str2.isEmpty();
    }

    // solution 2 - using Arrays.sort()
    public boolean isAnagram2(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    // solution 3 - using TreeSet
    public boolean isAnagram3(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        str1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        return str1.equals(str2);
    }


    // Q6
    /* Password Validation
        Write a return method that can verify if a password is valid or not.
        Requirements:
        1. Password MUST be at least have 8 characters and should not contain space
        2. Password should at least contain one upper case letter
        3. Password should at least contain one lowercase letter
        4. Password should at least contain one special character
        5. Password should at least contain a digit
     */
    // solution 1
    public boolean isValidPassword(String password) {
        String upperCase = "(.*[A-Z].*)";
        String lowerCase = "(.*[a-z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*)";
        String space = "(.*[ ].*)";

        return password.length() >= 8 && !password.matches(space) && password.matches(upperCase)
                && password.matches(lowerCase) && password.matches(numbers) && password.matches(specialChars);
    }

    // solution 2
    public boolean isValidPassword2(String password) {
        return password.length() >= 8 && !password.contains(" ") && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*") && password.matches(".*[0-9].*")
                && password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }


    // Q7
    /* Write a method that can remove the duplicated values from String */
    // solution 1
    public String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i);
            }
        }
        return result;
    }


    // Q8
    /* Write a method that can return the unique characters from the String */
    // solution 1
    public String uniqueChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    // solution 2
    public String uniqueChars2(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }
        return result;
    }

    // solution 3 - using Collections.frequency()
    public String uniqueChars3(String str) {
        String result = "";
        for (String each : str.split("")) {
            if (Collections.frequency(Arrays.asList(str.split("")), each) == 1) {
                result += str;
            }
        }
        return result;
    }

    // solution 4 - using Strings contains() method
    public String uniqueChars4(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i);
            }
        }
        return result;
    }


    // Q9
    /* Sort the letters and numbers from an alphanumeric string */
    // solution 1
    public String sortAlphanumeric(String str) {
        String letters = "";
        String numbers = "";
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters += ch;
            } else if (Character.isDigit(ch)) {
                numbers += ch;
            }
        }

        char[] lettersCharArray = letters.toCharArray();
        Arrays.sort(lettersCharArray);

        char[] numbersCharArray = numbers.toCharArray();
        Arrays.sort(numbersCharArray);

        return new String(lettersCharArray) + new String(numbersCharArray);
    }


    // Q10
    /* Write a method that can find the maximum number from an int Array */
    // solution 1
    public int maxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // solution 2
    public int maxNumber2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    // solution
    public int maxNumber3(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    // solution 4
    public int maxNumber4(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }


    // Q11
    /* Write a method that can find the minimum number from an int Array */
    // solution 1
    public int minNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // solution 2
    public int minNumber2(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    // solution 3
    public int minNumber3(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
        }
        return min;
    }

    // solution 4
    public int minNumber4(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }


    // Q12
    /* Write a method that can sort an int array in Ascending order without using the sort method of Arrays class */
    // solution 1 - using bubble sort
    public int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //  solution 2 - using TreeSet
    public int[] sortAscending2(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[arr.length];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }


    // Q13
    /* Write a method that can sort an int array in Descending order without using the sort method of Arrays class */
    // solution 1 - using bubble sort
    public int[] sortDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // solution 2 - using TreeSet
    public int[] sortDescending2(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); // reverse order
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[arr.length];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }


    // Q14
    /* Write a method that returns the prime numbers of given number */
    // solution 1
    public String primeNumbers(int num) {
        String result = "";
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                result += i + " ";
            }
        }
        return result.trim();

    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    // Q15
    /* Write a method that will accept a number and check if the number is an Armstrong number.
    If the number is an Armstrong number, return true otherwise return false */

    // solution 1
    public boolean isArmstrong(int num) {
        String str = num + "";
        int power = str.length();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (int) Math.pow(Integer.parseInt(str.charAt(i) + ""), power);
        }
        return sum == num;
    }

    // solution 2
    public boolean isArmstrong2(int num) {
        String nunStr = Integer.toString(num);
        int power = nunStr.length();
        int sum = 0;

        for (char ch : nunStr.toCharArray()) {
            sum += (int) Math.pow(Character.getNumericValue(ch), power);
        }
        return sum == num;
    }


    // Q16
    /* Write a method that will accept a number(long) and determine if the number is a palindrome number. */

    // solution 1
    public boolean isPalindrome(long num) {
        String strNum = String.valueOf(num);
        int left = 0;
        int right = strNum.length() - 1;
        while (left < right) {
            if (strNum.charAt(left) != strNum.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // solution 2
    public boolean isPalindrome2(long num) {
        String strNum = String.valueOf(num);
        String reversed = new StringBuilder(strNum).reverse().toString();
        long reversedNum = Long.parseLong(reversed);
        return num == reversedNum;
    }

    // solution 3
    public boolean isPalindrome3(long num) {
        String strNum = String.valueOf(num);
        for (int i = 0; i < strNum.length() / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(strNum.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // solution 4
    public boolean isPalindrome4(long num) {
        long reversed = 0;
        long temp = num;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return num == reversed;
    }


    // Q17
    /* Swap two variables values without using a third variable */

    // solution 1
    public void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }

    // solution 2
    public void swap2(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a = " + a + ", b = " + b);
    }


    // Q18
    /* Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
        ➔ if the number can be divisible by 3, 5 and 15, then it should only be displayed in
        DivisibleBy15 section
        ➔ if the number can be divisible by 3 but cannot be divisible by 15, then it should only be
        displayed in DivisibleBy3 section
        ➔ if the number can be divisible by 5 but cannot be divisible by 15, then it should only be
        displayed in DivisibleBy5 section
        ex:
        OutPut:
        Divisible By 15 15 30 45 60 75 90
        Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
        Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99 */

    public void divisibleBy3_5_15() {
        String by3 = "";
        String by5 = "";
        String by15 = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) { // start with the most specific condition
                by15 += i + " ";
            } else if (i % 5 == 0) {
                by5 += i + " ";
            } else if (i % 3 == 0) {
                by3 += i + " ";
            }
        }
        System.out.println("Divisible By 15 " + by15);
        System.out.println("Divisible By 5 " + by5);
        System.out.println("Divisible By 3 " + by3);
    }





}



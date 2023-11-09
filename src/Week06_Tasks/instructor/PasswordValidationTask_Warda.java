package Week06_Tasks.instructor;

import org.w3c.dom.ls.LSOutput;

public class PasswordValidationTask_Warda {

    public static boolean validLoginPassword(String password) {


        int length = password.length();
        boolean space = !password.contains(" ");
        boolean uppercase = false;
        boolean lowercase = false;
        boolean numbers = false;


        for (int i = 0; i < password.length(); i++) {

            char characters = password.charAt(i);


            if (characters >= 65 && characters <= 90) {
                uppercase = true;
            }// A-Z
            else if (characters >= 97 && characters <= 122) {
                lowercase = true;
            }// a-z
            else if (characters >= 48 && characters <= 57) {
                numbers = true;
            } // 0-9

        }


        if (length >= 6 && space && uppercase && lowercase && numbers) {
          return true;
        } else {
            return false;
        }
    }

/* ****************************************************************************************************** */
    public static void main(String[] args) {
        String password = "Ab@5678";
        System.out.println("Your Password is valid = " + validLoginPassword(password));
    }


}

 /*
 1. Write a return method that can verify if a password is valid or not.

requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false

*/
/* ********************** OPTION #2 *******************************************
        // Define your password criteria
        int minLength = 6;  // Minimum length
        boolean hasUppercase = !password.equals(password.toLowerCase());  // At least one uppercase letter
        boolean hasLowercase = !password.equals(password.toUpperCase());  // At least one lowercase letter
        boolean hasDigit = false;  // At least one digit
        boolean hasSpecialChar = false;  // At least one special character

        // Check if the password meets the minimum length requirement
        if (password.length() < minLength) {
            return false;  // Password is not valid
        }

        // Check if the password contains at least one digit and one special character
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }

            if (hasDigit && hasSpecialChar) {
                break;
            }
        }

        // Check if the password meets all the criteria
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        String password = "MyP@ssw0rd";
        if (isPasswordValid(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
 */
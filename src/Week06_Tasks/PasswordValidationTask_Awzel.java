package Week06_Tasks;

public class PasswordValidationTask_Awzel {

    public static boolean isPasswordValid(String password) {

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(each)) {
                hasLowerCase = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }


    public static void main(String[] args) {
        String password = "IamPassword000-";
        if (isPasswordValid(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
    }

}
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns false
 */
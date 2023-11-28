package Week06_Tasks.instructor;

public class W6_PasswordValidation {
    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
*/
    public static void main(String[] args) {
        System.out.println(PassWordvalidation("Ab*1Ab"));
        System.out.println(PassWordvalidation("Ab*1A"));
    }
    public static boolean PassWordvalidation(String password) {

        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";

        boolean  HasLower = password.matches(lowercase),
                HasUppere = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                Valid = false;

        if(password.length() >= 6 && !password.contains(" "))
            if( HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;
        return Valid;
    }

/*    public class String_PassWordValidation2 {
        public static boolean isPasswordValid(String password) {
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasSpecialChar = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else {
                    hasSpecialChar = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;


*/
/*
    public static boolean validPassword(String password){
        boolean hasUppercase=false;
        boolean hasLowercase=false;
        boolean hasDigit=false;
        boolean hasSpecialChar=false;
        boolean validPassword=false;


        char[] chars=password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                hasUppercase=true;
            } else if (Character.isLowerCase(each)) {
                hasLowercase=true;
            } else if (Character.isDigit(each)) {
                hasDigit=true;
            } else {//special character
                hasSpecialChar=true;
            }


            if (hasLowercase && hasUppercase && hasDigit && hasSpecialChar){
                validPassword=true;
            }
        }
        return validPassword;

*/
}
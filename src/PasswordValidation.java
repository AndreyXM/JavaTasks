public class PasswordValidation {
    public enum PassCondition {
        SPACE,
        LOWER,
        UPPER,
        DIGIT,
        SPECCHAR
    }

    public static void main(String[] args) {
        //String -- Password Validation Task
        //1. Write a return method that can verify if a password is valid or not.

        printPass("12345 ");
        printPass("12345");
        printPass("123456");
        printPass("123456A");
        printPass("123456Ab");
        printPass("123456Ab!");
        printPass("!ABcdeF");
        printPass("!ABcdeF8");
        printPass(""); // empty
        printPass(null); // null -> empty
    }

    public static void printPass(String pass) {
        if (pass != null && !pass.isEmpty()) {
            System.out.println("The \"" + pass + "\" is " + ((passwordVerification(pass)) ? "valid" : "invalid") + " password");
        } else System.out.println("Error -> The password is empty");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static boolean passwordVerification(String pass) {
        String errMsgPref = "Error -> The password \"" + pass + "\" ";
        boolean result = true;

        //1. Password MUST be at least have 6 characters and should not contain space
        if (isConditionValid(pass, PassCondition.SPACE)) {
            System.out.println(errMsgPref + "should not contain space");
            result = false;
        }
        if (pass.length() < 6) {
            System.out.println(errMsgPref + "MUST be at least have 6 characters");
            result = false;
        }
        if (!isConditionValid(pass, PassCondition.UPPER)) {
            //2. PassWord should at least contain one upper case letter
            System.out.println(errMsgPref + "should at least contain one upper case letter");
            result = false;
        }
        if (!isConditionValid(pass, PassCondition.LOWER)) {
            //3. PassWord should at least contain one lowercase letter
            System.out.println(errMsgPref + "should at least contain one lowercase letter");
            result = false;
        }
        if (!isConditionValid(pass, PassCondition.SPECCHAR)) {
            //4. Password should at least contain one special characters
            System.out.println(errMsgPref + "should at least contain one special characters");
            result = false;
        }
        if (!isConditionValid(pass, PassCondition.DIGIT)) {
            //5. Password should at least contain a digit
            System.out.println(errMsgPref + "should at least contain a digit");
            result = false;
        }

        //if all requirements above are met, the method returns true, otherwise returns
        return result;
    }

    public static boolean isConditionValid(String text, PassCondition condition) {
        for (int i = 0; i < text.length(); i++) {
            switch (condition) {
                case SPACE: {
                    if (Character.isSpaceChar(text.charAt(i))) {
                        return true;
                    }
                    break;
                }
                case LOWER: {
                    if (Character.isLowerCase(text.charAt(i))) {
                        return true;
                    }
                    break;
                }
                case UPPER: {
                    if (Character.isUpperCase(text.charAt(i))) {
                        return true;
                    }
                    break;
                }
                case SPECCHAR: {
                    if ("!@#$%^&*()-_=+,{};:/.?|~".indexOf(text.charAt(i)) != -1) {
                        return true;
                    }
                    break;
                }
                case DIGIT: {
                    if (Character.isDigit(text.charAt(i))) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
}
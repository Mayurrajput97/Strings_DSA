package com.Strings_DSA;

public class StringValidator {
    public static boolean validate(String str) {
        // Check if the string is not empty
        if (str == null || str.isEmpty()) {
            return false;
        }
        boolean hasAlphabetic = false;
        boolean hasNumeric = false;
        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is an alphabetic character
            if (Character.isLetter(ch)) {
                hasAlphabetic = true;
            }
            // Check if the character is a numeric digit
            else if (Character.isDigit(ch)) {
                hasNumeric = true;
            }
            // If the character is neither alphabetic nor numeric, the string is invalid
            else {
                return false;
            }
        }
        // If both types of characters are found, the string is valid
        return hasAlphabetic || hasNumeric;
    }

    public static void main(String[] args) {
        String str = "7875";
        System.out.println("Original String: " + str);
        boolean isValid = validate(str);
        if (isValid) {
            System.out.println(" The String is valid");
        } else {
            System.out.println(" The String is not valid.");
        }
    }
}

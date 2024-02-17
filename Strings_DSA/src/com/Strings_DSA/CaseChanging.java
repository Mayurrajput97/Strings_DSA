package com.Strings_DSA;
public class CaseChanging {
    public static void caseChanging(StringBuffer str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                str.setCharAt(i, Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                str.setCharAt(i, Character.toLowerCase(c));
            }
        }
    }
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Mayur, Rajput");
        System.out.println("Original String : " + str);
        caseChanging(str);
        System.out.println("Changed String : " + str);
    }
}

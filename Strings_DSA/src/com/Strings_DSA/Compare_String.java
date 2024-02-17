package com.Strings_DSA;

public class Compare_String {
	public static boolean compare(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		if (s1.length() != s2.length())
			return false;
		for (int i = 0; i < s2.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s1 = "Mayur";
		String s2 = "Rajput";
        boolean isValid = compare(s1,s2);
        if (isValid) {
            System.out.println(" The String is valid");
        } else {
            System.out.println(" The String is not valid.");
        }
	}
}

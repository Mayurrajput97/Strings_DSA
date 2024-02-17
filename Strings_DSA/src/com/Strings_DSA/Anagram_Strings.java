package com.Strings_DSA;

public class Anagram_Strings {
	    public static boolean areAnagrams(String str1, String str2) {
	        // Removing spaces and convert to lowercase
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // Create an array to store character counts
	        int[] charCounts1 = new int[256]; 
	        int[] charCounts2 = new int[256];
	        // Count characters for str1
	        for (int i = 0; i < str1.length(); i++) {
	            charCounts1[str1.charAt(i)]++;
	        }
	        // Count characters for str2
	        for (int i = 0; i < str2.length(); i++) {
	            charCounts2[str2.charAt(i)]++;
	        }
	        // Compare character counts arrays
	        for (int i = 0; i < 256; i++) {
	            if (charCounts1[i] != charCounts2[i]) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        String str1 = "Mayur";
	        String str2 = "Rajput";
	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }
	}




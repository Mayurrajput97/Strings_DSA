package com.Strings_DSA;
import java.util.Arrays;

public class Count_Dublicates {
	    public static void main(String[] args) {
	        String str = "Mayur Rajput Mayur";
	        int[] charCounts = new int[256];
	        for (char ch : str.toCharArray()) {
	            charCounts[ch]++;
	        }
	        for (int i = 0; i < charCounts.length; i++) {
	            if (charCounts[i] > 1) {
	                System.out.println("Character '" + (char) i + "' occurs " + charCounts[i] + " times.");
	            }
	        }
	    }
	}


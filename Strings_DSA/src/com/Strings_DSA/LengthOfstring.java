package com.Strings_DSA;

public class LengthOfstring {
	public static void main(String[] args) {
		String str = "Mayur Rajput";
		System.out.println(str);
		int length = findlength(str);
		System.out.println("The Length of String is : " + length);
	}
	static int findlength(String str) {
		int length =0;
		for (int i=0; i<str.length(); i++)
		{
			length++;
		}
		return length;
	}
}

package com.Strings_DSA;
public class CountVowels {
	public static void main(String[] args) {
		String str = "Mayur Rajput";
		System.out.println(str);
		int CountVowels = count(str);
		System.out.println(CountVowels);
	}
	 static int count(String str) {
		 int count =0;
		 str = str.toLowerCase();
		 for(int i=0; i< str.length(); i++)
		 {
			 char ch = str.charAt(i);
			 if(ch == 'a' || ch =='e' || ch == 'i' || ch =='o' ||ch == 'u')
			 {
				 count++;
			 }
		 }
		return count;
	}
}

package week3.day1.homeassignment_week3_day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops"; 
		String text2 = "potss";
		int len1=text1.length();
		int len2=text2.length();
		if(len1==len2) {
			System.out.println("equal");
			char[] chtxt1 = text1.toCharArray();
			char[] chtxt2 = text2.toCharArray();
			Arrays.sort(chtxt1);
			Arrays.sort(chtxt2);
			boolean result=Arrays.equals(chtxt1, chtxt2);
			if(result)
			{
				System.out.println("The given strings are Anagram " + text1+ " and " +text2);
				
			}
			else {
				System.out.println("The given strings are not an Anagram "  + text1+ " and " +text2);
			}

		}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
				
	}

}

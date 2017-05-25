package String;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args){
		String str1 = "abc";
		String str2 = "ba";
		
		Boolean isAnagram =checkAnagrams(str1, str2);
		if(isAnagram)
		System.out.println("Strings are anagrams");
		else
		System.out.println("Strings are not anagrams");
	}

	private static Boolean checkAnagrams(String str1, String str2) {
		// TODO Auto-generated method stub
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 != len2) return false;
		char[] arr1 = new char[len1];
		char[] arr2 = new char[len2];
		arr1 = str1.toCharArray();
		arr2= str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String newStr1  = String.valueOf(arr1);
		String newStr2 = String.valueOf(arr2);
		if(newStr1.equals(newStr2))
		return true;
		else
		return false;
	}
}

package com.abhi.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;
/**
 * AnagramDetection	--	This program checks given
 * 						string are Anagram / not
 * 
 * @author Abhishek Shigavan
 */
public class AnagramDetection {
/**
 * This method checks takes 2 string
 * as input & checks they are Anagram / not
 *
 * @param str1	-- 1st String value
 * @param str2	-- 2nd String value 
 */
	public static boolean checkAnagram(String str1, String str2) {

	    boolean flag = false;
	    
	    //checking length of string are equal / not
	    if(str1.length() != str2.length()) {
	    	
	    	return flag;
	    }
	    else {
	    	//converting string into lower case & store it as character into char array
	    	char[] str1Array = str1.toLowerCase().toCharArray();
	    	char[] str2Array = str2.toLowerCase().toCharArray();
	    	
	    	//sorting the array
	    	Arrays.sort(str1Array);
	    	Arrays.sort(str2Array);
	    	
	    	//checking sorted array are equal / not
	    	flag = Arrays.equals(str1Array, str2Array);
	    }
	    return flag;
	}
/**
 * This method takes strings as input & pass this
 * input to method to check strings are anagram / not
 * Prints result return by method
 *
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//getting strings to check 
		System.out.println("Enter 1st String to check for Anagram : ");
		String f_String = sc.next();
		
		System.out.println("Enter 2nd String to check for Anagram : ");
		String s_String = sc.next();
			
		boolean flagResult = checkAnagram(f_String, s_String);
		
		//checking result & printing result
	    if(flagResult == true) {
	    	System.out.println(f_String+" & "+s_String+" are Anagram");
	    }
	    else {
	    	System.out.println(f_String+" & "+s_String+" are not Anagram");
	    }
	}
}

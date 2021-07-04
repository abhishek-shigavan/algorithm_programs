package com.abhi.algorithmprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * StringPermutation	--	Finding the permutations of given string by
 * 							Recursive & Iterative approch and checking 
 * 							the permutations are same / not
 * 
 * @author Abhishek Shigavan
 *
 */
public class StringPermutation {
/**
 * This method swapped characters at position
 * 
 * @param str -- String Value
 * @param i	-- 1st Position
 * @param j -- 2nd Position
 * @return swapped string
 */
	private static String swap(String str, int i, int j) {
        
		char temp;
        char[] charArray = str.toCharArray();
        
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        
        return String.valueOf(charArray);
    }
/**
 * This method computes permutation of given string by Recursive
 * approach and store it in list & return the list
 * 	
 * @param str -- Given String value
 * @param stringByRecursion -- list to store permutation
 * @param l -- starting index
 * @param r -- end index
 * @return
 */
    public static List<String> getPermutationByRecursion(String str, List<String>stringByRecursion, int l, int r) {
  
    	if(l == r) {
            
            stringByRecursion.add(str);
        }
    	
        else{
        	
            for(int i = l; i <= r ; i++){
                
            	str = swap(str, l, i);
                getPermutationByRecursion(str, stringByRecursion, l+1, r);
                str = swap(str, l, i);

            }
        }
        return stringByRecursion;
    }
/**
 * This method computes all the permutation of given string using
 * Iteration approach & store it in list & returns the same
 *     
 * @param str -- given string
 * @param permutString -- empty string to store permutation
 * @param stringByIteration -- list to store permutation
 * @return
 */
    public static List<String> getPermutationByIteration(String str, String permutString, List<String> stringByIteration) {
    	
    	 // If string is empty
        if (str.length() == 0) {
  
            stringByIteration.add(permutString);
        }
  
        for (int i = 0; i < str.length(); i++) {
  
           char ch = str.charAt(i);
  
            //Rest of the string after excluding the ith character
            String restOfString = str.substring(0, i) + str.substring(i + 1);
  	
            getPermutationByIteration(restOfString, permutString + ch, stringByIteration);
           
        }
        
    	return stringByIteration;
    }
/**
 * This method pass the given string to get permutation by both
 * i.e Recursive & Iterative approach.
 * And matches the result by both methods then prints result according 
 * to it 
 *     
 * @param str - given string to compute permutation
 * @return - No return
 */
    public static void checkPermutation(String str) {
    	
    	int length = str.length();
		
    	//list to store permutations
    	List<String> stringByRecursive = new ArrayList<>();
		List<String> stringByIteration = new ArrayList<>();
		
		
		List<String> listOfPermutByRecursive = getPermutationByRecursion(str, stringByRecursive, 0, length-1);
		List<String> listOfPermutByIterate = getPermutationByIteration(str, "", stringByIteration);
		
		//sorting the permutation list
		Collections.sort(listOfPermutByRecursive);
		Collections.sort(listOfPermutByIterate);
		
		System.out.println("\nPermutation of String : "+str+" By Recursion Approch \n");
		System.out.println(listOfPermutByRecursive);
		
		System.out.println("\nPermutation of String : "+str+" By Iterative Approch \n");
		System.out.println(listOfPermutByIterate);
		
		//checking both list are same / not
		if(listOfPermutByIterate.equals(listOfPermutByRecursive)) {
			
			System.out.println("\nPermutation Given By Iterative Approch & Recursion Approch Are Same");
		}
		else {
			
			System.out.println("\nPermutation Given By Iterative Approch & Recursion Approch Are Not Same");
		}
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String To Get Permutation : ");
		String str = sc.next();
		
		checkPermutation(str);
	}
}

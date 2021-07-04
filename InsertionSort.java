package com.abhi.algorithmprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * InsertionSort	--	Reading Strings & printing them in sorted
 * 				order using Insertion Sort
 * 
 * @author Abhishek Shigavan
 *
 */
public class InsertionSort {
/**
 * This methods reads words from array & sort them using Insetion Sorting
 * 	
 * @param wordArray - contains all the words of given file
 */
	public static void insertionSort(String[] wordArray) {
		
		String value = "";
		int hole = 0;
		
		for(int i=1; i < wordArray.length; i++) {
			
			value = wordArray[i];
			hole = i;
			
			//checking current index value with previous index values
			while(hole > 0 && wordArray[hole -1].compareTo(value) > 0) {
				
				//swapping the values
				wordArray[hole] = wordArray[hole -1];
				hole = hole -1;
			}
			
			wordArray[hole] = value;
		}
		
		System.out.println("Array After Insertion Sort : ");
		
		for(int i =0; i < wordArray.length; i++) {
			
			System.out.println(wordArray[i]);
		}
	}
/**
 * This method reads file & store the words in array
 * & pass this array to insertionSort method for sorting
 * 	
 * @param args
 * @throws FileNotFoundException
 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//empty string to store words
		String wordList = "";
		
		//reading wordlist file
	    Scanner inFile = new Scanner(new File("C:\\Users\\Abhi\\WordList.txt")).useDelimiter(",\\s*");
	    Scanner sc = new Scanner(System.in);

	    //storing all the words into string
	    while (inFile.hasNext()) {
	     
	      wordList = inFile.next();
	    }
	    
	    //converting wordList string to lower case
	    String lowercaseWord = wordList.toLowerCase();
	    
	    //storing words into array
	    String[] wordArray = lowercaseWord.split("\\s");
	    
	    System.out.println("Array Before Insertion Sort : ");
	    
	    for(int i =0; i < wordArray.length; i++) {
			
			System.out.println(wordArray[i]);
		}
	
	    insertionSort(wordArray);
	}

}

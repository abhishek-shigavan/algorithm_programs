package com.abhi.algorithmprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/**
 * BinarySearchWord	--	Taking a word as input & Searching it using binary
 * 				search in word file which contains words. Printing the 
 * 				search result.
 *    
 * @author Abhishek Shigavan
 *
 */
public class BinarySearchWord {
/**
 * This method converts the given array into lower case
 * then sort the array and returns same
 * 	
 * @param wordArray -- Array of words of wordlist
 * @return Sorted Array of words
 */
	public static String[] sortWord(String[] wordArray) {
	
		//Defining array to store words in sorted manner
		String lowerCaseWordArray[] = new String[wordArray.length];;
		
		for(int i=0; i < wordArray.length; i++) {
			
			//converting values of word array into lower case
			String lowerCaseWord = wordArray[i].toLowerCase();
			//adding words to array
			lowerCaseWordArray[i] = lowerCaseWord;
		}
	
		//sorting array
		Arrays.sort(lowerCaseWordArray);
	
		for(int i=0; i < lowerCaseWordArray.length; i++ ) {
		    	
			System.out.println(lowerCaseWordArray[i]);
		}
		
		return lowerCaseWordArray;
	}
/**
 * This method searches the given word in given array of word
 * & prints result according to search
 * 	
 * @param wordArray	--	Array of words present in wordlist
 * @param searchWord -- Word to search into wordlist 
 */
	public static void searchWord(String[] wordArray, String searchWord) {
		
		//setting low, mid, high initial value
		int low = 0, mid =0;
		int high = wordArray.length - 1;
	
		boolean flag = false;
		
		while(low <= high) {
			
			//computing mid
			mid = (low + high) / 2;
			
			String word = wordArray[mid];
			
			//checking search word & wordlist word are same / not 
			int searchResult = searchWord.compareTo(word);
			
			//checking compare operation result 
			if(searchResult == 0) {
				
				System.out.println("We got ur word : "+word);
				flag = true;
				break;
			}
			else if(searchResult < 0) {
				//updating high value
				high = mid - 1;
			}
			else if(searchResult > 0) {
				//updating low value
				low = mid + 1;
			}
		}
		
		if(flag == false) {
			
			System.out.println("No such word present in the file");
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//empty string
		String wordList = "";
		
		//reading wordlist file
	    Scanner inFile = new Scanner(new File("C:\\Users\\Abhi\\WordList.txt")).useDelimiter(",\\s*");
	    Scanner sc = new Scanner(System.in);

	    //storing words in wordList String
	    while (inFile.hasNext()) {
	      
	      wordList = inFile.next();
	    }
	    
	    //storing words into array
	    String[] words = wordList.split("\\s");
	    
	    //getting array of words in sorted manner
	    String[] sortedWordArray =sortWord(words);
	    
	    System.out.println("Enter word to search : ");
	    String searchWord = sc.next();
	    //converting search word into lower case
	    String lowSearchWord = searchWord.toLowerCase();
	    inFile.close();
	    
	    //searching word 
	    searchWord(sortedWordArray, lowSearchWord);
	}
}



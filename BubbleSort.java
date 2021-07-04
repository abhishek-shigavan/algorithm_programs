package com.abhi.algorithmprograms;
/**
 * BubbleSort	--	Program implements bubble sorting
 * 			technique on integers.
 * 
 * @author Abhishek Shigavan
 *
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		
		//local variables
		boolean flag;
		int temp;
		
		//array of integer numbers
		int[] numberArray = new int[] {54, 4, 23, 87, 37, 70, 55, 47} ;
		
		//for pass
		for(int k =1; k < numberArray.length; k++) {
			
			//initially setting flag as false  
			flag = false;
		
			//to get array index
			for(int i=0; i < numberArray.length -1; i++) {
				
				//comparing number at present index with number at next index
				if(numberArray[i] > numberArray[i+1]) {
					
					//swapping of numbers	
					temp = numberArray[i+1];
					numberArray[i+1] = numberArray[i];
					numberArray[i] = temp;
					
					//setting as true as sorting is done
					flag = true;
				}
			}
			
			//i.e array is already sorted
			if (flag == false) {
				break;
			}
		}
		
		//printing sorted array
		for(int i=0; i < numberArray.length; i++) {
			
			System.out.println(numberArray[i]);
		}
	}
}

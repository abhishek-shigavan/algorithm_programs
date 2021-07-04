package com.abhi.algorithmprograms;

import java.util.Scanner;
/**
 * FindYourNumber	--	This program takes 1 number from
 * 				user & give user a limit & ask to think
 * 				any no between limit & guesses that number
 *  
 * @author Abhishek Shigavan
 *
 */
public class FindYourNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		
		//setting low, high & mid value
		int low = 1;
		int high = number - 1;
		int midValue =0;
		
		System.out.println("Think any number between 0 - "+high);
		
		while(low < high) {
			//computing mid value
			midValue = (low + high)/2;
			//taking user input
			System.out.println("Is "+midValue+" is the Number you are thinking ");
			System.out.println("If yes press 0");
			System.out.println("If Ur number is greater than "+midValue+" Press 1");
			System.out.println("If Ur number is less than "+midValue+" Press 2");
			int userResponse = sc.nextInt();
			
			if(userResponse == 0) {
				
				System.out.println("We got ur Number...!!!");
				break;
			}
			else if(userResponse == 1) {
				//for number greater than mid setting new low value
				low = midValue + 1;
				
			}
			else if(userResponse == 2) {
				//for number less that mid setting new high value
				high = midValue - 1;
			}
		}
		
	}

}

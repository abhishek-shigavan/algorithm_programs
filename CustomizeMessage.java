package com.abhi.algorithmprograms;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * CustomizeMessage	--	Reading the message & replacing the 
 * 				Regex field with Proper value
 * 
 * @author Abhishek Shigavan
 *
 */
public class CustomizeMessage {
/**
 * This method defines regex to match in the message
 * & replace the regex in message with proper value
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		String message = "Hello <<name>> , We have your full name as <<full name>> in our system."
				+ " your contact number is 91-xxxxxxxxxx. Please, let us know in any case of clarification"
				+ " Thank You BridgeLabz 01/01/2016 ";
		
		//defining date format
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		
		//getting local date
		Date date = new Date();
		String localDate = dateFormat.format(date);
		
		//defining regex to search in message
		String nameRegex = "<<name>>";
		String fullNameRegex = "<<full name>>";
		String mobNoRegex = "91-xxxxxxxxxx";
		String dateRegex = "01/01/2016";
		
		//replacing regex with proper value
		message = message.replaceAll(nameRegex, "Abhihsek");
		message = message.replaceAll(fullNameRegex, "Abhishek Shigavan");
		message = message.replaceAll(mobNoRegex, "91-9874561230");
		message = message.replaceAll(dateRegex, localDate);
		
		//printing message with proper values
		System.out.println(message);

	}
}

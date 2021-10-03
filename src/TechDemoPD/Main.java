package TechDemoPD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//our calculator program
		  Scanner myObj = new Scanner(System.in);
		  String input;
		  int result = 0;
		    
		    // Enter username and press Enter
		    
		  
		
		System.out.println("Please enter a symbol and two numbers");
		input = myObj.nextLine();
		
		String[] words = input.split(" ");
		
		if (words[0].contentEquals("+"))
		{
			result = Integer.parseInt(words[1]) + Integer.parseInt(words[2]);
		}
		else if (words[0].contentEquals("-"))
		{
			result = Integer.parseInt(words[1]) - Integer.parseInt(words[2]);
		}
		else if (words[0].contentEquals("*"))
		{
			result = Integer.parseInt(words[1]) * Integer.parseInt(words[2]);
		}
		else 
		{
			System.out.println("ERROR, wrong input");
		}
		
		System.out.println("Your result: " + result);
		
		//our feature we need to implement
//		else if (words[0].contentEquals("/"))
//		{
//			result = Integer.parseInt(words[1]) / Integer.parseInt(words[2]);
//		}
		

	}

}

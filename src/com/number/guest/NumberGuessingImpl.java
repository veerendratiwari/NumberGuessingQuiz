/**
 * 
 */
package com.number.guest;

import java.util.Random;
import java.util.Scanner;

/**
 * @author TiwariV
 *
 */
public class NumberGuessingImpl { 
	
	Scanner in = new Scanner(System.in);
	public NumberGuessingImpl(){
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------Instructions----------------------------------------------");
		System.out.println("You have to write 'ready or r' to start the quiz and press enter key.");
		System.out.println("Choose the number between 1 to 100 and keep in your mind and answer the question as below - ");
		System.out.println("       Type 'lower or l' if the display number is lower ");
		System.out.println("       Type 'higher or h' if the display number is higher ");
		System.out.println("       Type 'yes or y' if the display number is correct ");
		System.out.println("You have to write 'end or e' if you want to exit from quiz.");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------");
	    System.out.println("Please enter \"ready or r\" to start the quiz: ");
	}
	public void startQuiz() {
		label: do {
	    	String  s = in.nextLine();
	    	  // do stuff
	    	  if ("ready".equalsIgnoreCase(s) || "r".equalsIgnoreCase(s)) {
	    		  System.out.println("-------------------------------------------------------------------------------------------");
	    		  System.out.println("-------------------------------------------------------------------------------------------");
	    		  System.out.println("Be ready to see the first number.");
	    		  System.out.println("-------------------------------------------------------------------------------------------");
	    		  System.out.println("-------------------------------------------------------------------------------------------");
	    		  break;
	    	  }else{
	    		  System.out.println("Wrong entry, please write \"ready or r\" to start the quiz: ");
	    		  continue label;
	    	  }
	    	} while(true);
		
	}
	
	public void startGuessing() {
	    int lower = 0;
	    int higher = 101;
	    label1: do {
	    	if(lower +1 == higher){
	    		System.out.println("Lower number is "+lower);
	    		System.out.println("Higher number is "+higher);
	    		System.out.println("You have reached the closest selected number.");
	    		break;
	    	}
	    	int newNumber= getNumber(lower, higher);
	    	System.out.println("Is this number "+newNumber +"? ");
	    	String  s = in.nextLine();
	    	if ("lower".equalsIgnoreCase(s) || "l".equalsIgnoreCase(s)) {
	    		lower = newNumber;
	    		continue label1;
	    	} else if ("higher".equalsIgnoreCase(s) || "h".equalsIgnoreCase(s)){
	    		higher = newNumber;
	    		continue label1;
	    	} else if ("yes".equalsIgnoreCase(s) || "y".equalsIgnoreCase(s)){
	    		System.out.println("Number guessing quiz is ended and your selected number is : "+newNumber);
	    		break;
	    	} else if ("end".equalsIgnoreCase(s) || "e".equalsIgnoreCase(s)){
	    		System.out.println("You have choosen to exit from quiz.");
	    		break;
	    	} else {
	    		System.out.println("Either you have not provided the expected value or you have left empty.");
	    		System.out.println("Please see the instructions on the top to get better result.");
	    		break;
	    	}   
	    } while(true);
		
	}


	private static int getNumber(int lower, int higher) {
		Random rand = new Random();
		int newNumber = rand.nextInt(higher-lower) + lower;;
		return newNumber;
	}


}

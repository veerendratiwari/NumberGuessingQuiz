/**
 * 
 */
package com.number.guest;


/**
 * @author Veerendra Tiwari
 *
 */
public class NumberGuessingMain { 

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		NumberGuessingImpl impl = new NumberGuessingImpl();
	    impl.startQuiz();
	    impl.startGuessing();
	}
}

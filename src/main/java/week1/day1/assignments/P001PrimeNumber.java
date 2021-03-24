package week1.day1.assignments;

public class P001PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */



	public static void main(String[] args) {



		// Declare an int Input and assign a value 13

		int i = 13;

		// Declare a boolean variable flag as false

		boolean boo = false;

		// Iterate from 2 to half of the input

		for (int j = 2; j <= i/2 ; j++) {
			

		// Divide the input with each for loop variable and check the remainder

			int remainder = i%j;

		// Set the flag as true when there is no remainder
			if (remainder == 0){
				boo = true;
			
			}
		// break the iterator
			
		}

		// Check the flag (Provide a condition)

			if (boo = true) {
				// Print 'Prime' when the condition matches
				System.out.println("Prime");
				
				// Print 'Not a Prime' when the condition doesn't match
			}else {
				System.out.println("Not Prime");
			}

	

		 
		
	}

}

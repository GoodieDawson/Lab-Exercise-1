/**
 * 
 */
package goodie.dawson;

//Importing necessary classes (Scanner classes)
import java.util.Scanner;

/**
 * @author Goodie Blake Dawson
 *
 */
public class Lab1_PartC_Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Telsling the user what the program does
		System.out.println("This program take a string input and reverses the order of each individual word's characters.");
		
		//Asking the user for input
		System.out.print("Please input a string: ");
		
		//Creating a new Scanner object 
		Scanner input = new Scanner (System.in);
		
		//Using the Scanner object to collect user input
		String str = input.nextLine();
		
		//Splitting the string into an array of words
		String [] strarray = str.split(" ");
		
		//Looping through array and reversing word at each index
		for (int i = 0; i < strarray.length; i++) {
			strarray[i] = new StringBuffer(strarray[i]).reverse().toString();
		}
		
		//Outputting a string of joined reversed words
		System.out.println("The reversed string is: " + String.join(" ", strarray));
		
		//Closing Scanner objects
		input.close();
	}

}

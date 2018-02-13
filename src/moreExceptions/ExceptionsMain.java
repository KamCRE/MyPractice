/**
 * 
 */
package moreExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author lancre
 *
 */
public class ExceptionsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 10, b = 6, c;
		

		/*if( a > b) {
			throw new ArithmeticException(" horrible problem");
		}*/
		System.out.println("In Main");
		
		try{
			foo();
		}catch (CustomerRecordMissingException crme) {
			System.out.println(crme.getMessage());
		}
		System.out.println("You didn't get here");

	}

	private static void foo() throws CustomerRecordMissingException {
		if(10 > 5) {
			throw new CustomerRecordMissingException("I'm in foo with an important message");
		}
		System.out.println("In foo");
		try {
			foo2();
			
		} catch (ArithmeticException ex) {
			System.out.println("I'm dealing with a problem.");
		} catch (FileNotFoundException fnfe) {
			System.out.println("Hey the file not found was thrown!!!!!");
		}finally {
			System.out.println("I will always happen");
		}
		System.out.println("You didn't get here");

	}

	private static void foo2() throws FileNotFoundException {
		int e = 45;
		System.out.println("In foo2");

		e = 1 / 0;
		FileReader fileReader = new FileReader("Bob");

		System.out.println("You didn't get here");
	}

}

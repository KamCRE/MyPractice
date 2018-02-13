/**
 * 
 */
package exceptions;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author lancre
 *
 */
public class Exceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enyter two integers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		
		System.out.println(n1 + " / " + n2 + " is " + (n1/n2));

		/*try {
			//statements; // Statements that may throw exceptions
			}
			catch (Exception1 exVar1) {
			//handler for exception1;
			}
			catch (Exception2 exVar2) {
			//handler for exception2;
			}
			...
			catch (ExceptionN exVarN) {
			//handler for exceptionN;
		
			}*/
		/*try {
		}catch (Exception1 | Exception2 | ... | Exceptionk ex) {
			// Same code for handling these exceptions
			}*/
	}
	
	// Declaring an Exception
	public void myMethod() throws IOException{
		
		// Throwing an Exception
		IllegalArgumentException ex = new IllegalArgumentException("Wrong Argument");
		//throw ex;
		throw new IllegalArgumentException("Wrong Argument");
	}
	
	/**
	 * printStackTrace()
	 * getMessage()
	 * toString()
	 * getStackTrace()
	 */
	
	/**
	 * The finally Clause
	 * 
	 * try{
	 * 	statements;
	 * }
	 * catch (TheException ex){
	 * 	handling ex;
	 * 
	 * }finally{
	 * 	finalStatements;
	 * }
	 * 
	 *  
	 */
	
	

}

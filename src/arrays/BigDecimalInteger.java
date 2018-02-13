package arrays;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class BigDecimalInteger {

	public static void main(String[] args) {
		BigInteger a = new BigInteger("92229992929929304857");
		BigInteger b = new BigInteger("2");
		BigInteger c = a.multiply(b);
		System.out.println(c);
		//add
		//subtract
		//multiply
		//divide
		//remainder
		
		BigDecimal d = new BigDecimal(1.0);
		BigDecimal e = new BigDecimal(3);
		BigDecimal f = d.divide(e, 20,BigDecimal.ROUND_UP);
		System.out.println(f);
		System.out.println(BigInteger.ONE);
		
		System.out.println();
		System.out.println("50! is \n" + factorial(50));

	}
	
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for(int i = 1; i<= n; i++) {
			result = result.multiply(new BigInteger(i + ""));
			System.out.println();
		}
		return result;
	}
	
	String[] array = {"red", "green", "blue"};
	ArrayList<String> list = new ArrayList<>();
	//ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
	
	
	String[] array1 = new String[list.size()];
	//list.toArray(array1);

}

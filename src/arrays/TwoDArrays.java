/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * @author lancre
 *
 */
public class TwoDArrays {
	   private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int[][] my2dArray = new int[6][6];
	        for(int row = 0; row<my2dArray.length; row++){
	            for(int column = 0; column < my2dArray[row].length; column++){
	                my2dArray[row][column] = scanner.nextInt();
	            }
	        }
	        System.out.println(hourlyGlass(my2dArray));
	        
	        
	        
	    }
	    private static int hourlyGlass(int[][] a){
	        
	        int largestSum = 0;
	        int counter = 0;
	        for(int row = 0; row<a.length-1; row++){
	            for(int column =0; column<a[row].length-1; column++){
	                int sum = 0;
	                for(int i =0; i<3; i++){
	                	sum += a[row][i];
	                    if(i==1){
	                        sum += a[row+1][i];
	                    }
	                    sum += a[row+2][i];
	            }
	                sum += a[row+1][column+1];
	                if(sum > largestSum){
	                    largestSum = sum;
	                }
	                
	            }
	        }
	        return largestSum;
	           

	}

}

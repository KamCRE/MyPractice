package arrays;

import java.util.Scanner;

public class arraysPractice {

	public static void main(String[] args) {
   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.of inputs: ");
        int input = scanner.nextInt();
        System.out.print("Enter "+input+" integers: ");
        int[] x = new int[input];
        for(int i = 0; i<x.length; i++){
            x[i] = scanner.nextInt();
        }
        //System.out.println();
        for(int j = 0; j<x.length; j++){
            System.out.print(x[j]+" ");
            
        }
     }

	}



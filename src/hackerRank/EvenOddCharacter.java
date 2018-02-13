/**
 * 
 */
package hackerRank;

import java.util.Scanner;

/**
 * @author lancre
 *
 */
public class EvenOddCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int no = scanner.nextInt();
	        String[] s = new String[no];
	        for(int i = 0; i<no; i++){
	            s[i] = scanner.next();
	        }
	        
	        for(int i = 0; i<s.length;i++){
	            String even = "", odd = "";
	            for(int j =0; j<s[i].length(); j++){
	                if(j==0 || j%2 != 1){
	                    even = even + s[i].charAt(j);
	                }else{
	                    odd = odd + s[i].charAt(j);
	                }
	            }
	            System.out.println(even +" "+odd);

	        }
	}

}

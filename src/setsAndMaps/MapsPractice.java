/**
 * 
 */
package setsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lancre
 *
 */
public class MapsPractice {

	/**
	 * @param args
	 */
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        Map<String, Integer> map = new HashMap<>();
	        int n = in.nextInt();
	        String[] myString = new String[n];
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            map.put(name, phone);
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            // Write code here
	            for(int i = 0; i<myString.length; i++){
	                myString[i] = s;
	            }
	        }
	        in.close();
	        for(int i = 0; i<myString.length; i++){
	            if(map.containsKey(myString[i])){
	                System.out.println(myString[i]+"="+map.get(myString[i]));
	            }else{
	                System.out.println("Not found");
	            }
	            
	        }
	    }

}

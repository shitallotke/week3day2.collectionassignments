/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
 */

package week3.day2.collectionassignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		//Declare An array for {3,2,11,4,6,7};
		Integer[] array1 =  {3,2,11,4,6,7};
		
		// Declare another array for {1,2,8,4,9,7};
		Integer[] array2 =  {1,2,8,4,9,7};
		
		// creating LinkedHashSet  
        Set<Integer> data = new LinkedHashSet<Integer>();
        
    	System.out.println("Intersection of two arrays : ");
    		//Declare for loop iterator from 0 to array length
    		for (int i=0;i<array1.length;i++){
    			//Declare a nested for another array from 0 to array length
    			for (int j=0;j<array2.length;j++){
    				//Compare Both the arrays using a condition statement
    				if(array1[i]==array2[j]){
    					data.add(array1[i]) ;
    				}
    			}
    		}
    		
    		for(Integer output : data) {
    			System.out.println(output);
    		}
    }

}

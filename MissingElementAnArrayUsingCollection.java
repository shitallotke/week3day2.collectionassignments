package week3.day2.collectionassignment;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementAnArrayUsingCollection {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8,10,12};
		Arrays.sort(arr);
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		

		//set.addAll(Arrays.asList(arr));
		//System.out.println(set);
		
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] - arr[i-1] == 1) {
				continue;
			}
			else{
				set.add((arr[i-1]+1));
			}
		}
		System.out.print("Missing treeset element : " );
		for(Integer output : set) {
			System.out.print (output + " ");
		}
			
		

				
	}

}

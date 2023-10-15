package java100;


//Write a program to remove all occurrences of a specific element from an array.s

import java.util.HashSet;

public class removeAllOccurrencesArray {

	public static void main(String[] args) {
		
		int arr[] = {1,1,1,1,2,2,4,5,6,7,8,9,9,4,3};
		
		HashSet<Integer> num =  new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			num.add(arr[i]);
		}
		
		for(int i : num) {
			System.out.println(i);
		}
	}

}

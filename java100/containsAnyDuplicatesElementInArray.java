//Implement a program to check if an array contains any duplicates.


package java100;

import java.util.HashSet;

public class containsAnyDuplicatesElementInArray {

	public static boolean duplicateElement(int arr[]) {

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}

		if (arr.length == hs.size()) {

			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		if (duplicateElement(arr)) {
			System.out.println(" array not contains any duplicates element");
		} else {

			System.out.println(" array contains duplicates element");
		}
	}

}

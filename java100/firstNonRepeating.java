
//Implement a program to find the first non-repeating element in an array.

package java100;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeating {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 1, 2 };

		Map<Integer, Integer> m = new HashMap();

		for (int i = 0; i < arr.length; i++) {

			if (m.containsKey(arr[i])) {

				m.put(arr[i], m.get(arr[i]) + 1);
			} else {
				m.put(arr[i], 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (m.get(arr[i]) == 1) {
				System.out.println(arr[i]);
				break;
			}
		}

//		whitout hashmap-------------------

//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			for (int j = 0; j < arr.length; j++) {
//
//				if (i != j && arr[i] == arr[j]) {
//					count++;
//					break;
//				}
//			}
//			if (count == 0) {
//				System.out.println("first non-repeating element in an array: "+arr[i]);
//				break;
//			}
//		}

	}

}

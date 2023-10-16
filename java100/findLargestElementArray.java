
//Q: Implement a program to find the largest element in an array.

package java100;

public class findLargestElementArray {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 2, 3, 6, 4, 7, 8, 9, 5, 2, 4, 17, 4 };
		int maxNum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("Max number in the array is: " + maxNum);

	}

}

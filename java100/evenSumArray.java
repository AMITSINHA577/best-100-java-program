
//Q Write a program to calculate the sum of all even numbers in an array.

package java100;

public class evenSumArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("sum of all even numbers in an array: " + sum);
	}

}

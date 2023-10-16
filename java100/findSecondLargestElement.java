
//Q: Implement a program to find the second largest element in an array.

package java100;

public class findSecondLargestElement {

	public static void main(String[] args) {

		int arr[] = { 16, 2, 3, 14, 5, 6 };
		int maxNum1 = Integer.MIN_VALUE;
		int maxNum2 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (maxNum1 < arr[i]) {
				maxNum2 = maxNum1;
				maxNum1 = arr[i];
			}
			if (maxNum1 > arr[i] && maxNum2 < arr[i]) {
				maxNum2 = arr[i];
			}
		}
		System.out.println("Max number in the array is: " + maxNum1);

		System.out.println("Max number in the array 2F is: " + maxNum2);

	}

}

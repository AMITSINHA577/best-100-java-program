package java100;

import java.util.Arrays;

public class medianTwoSortedArrays {

	public static void median(int arr[]) {

		Arrays.sort(arr);

		int mid = arr.length / 2;
		if (mid % 10 != 0) {
			System.out.println(arr[mid]);
		} else {
			int ans = (arr[mid] + arr[mid - 1]) / 2;
			System.out.println(arr[ans]);
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 2, 3, 5, 8 };
		int arr2[] = { 10, 12, 14, 16, 18, 20 };

		int resultArr[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {

			resultArr[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {

			resultArr[i + arr1.length] = arr2[i];
		}

		median(resultArr);

//		for (int i = 0; i < resultArr.length; i++) {
//
//			System.out.println(resultArr[i]);
//		}

	}

}

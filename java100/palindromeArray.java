//Program to check if an Array is Palindrome or not

package java100;

public class palindromeArray {

	public static void main(String[] args) {

		int arr[] = { 3, 6, 0, 6, 3 };
		int lengthArr = arr.length;
		boolean flage = true;
		for (int i = 0; i <= lengthArr / 2 && lengthArr != 0; i++) {

			if (arr[i] == arr[lengthArr - i - 1]) {
				flage = true;
				continue;
			} else {
				flage = false;
				break;
			}
		}
		if (flage) {
			System.out.println("Array is Palindrome");
		} else {

			System.out.println("Array is not Palindrome");
		}
	}

}

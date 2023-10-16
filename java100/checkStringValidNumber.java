
//	Q	How to check if a string is a valid number (integer or float)?

package java100;

public class checkStringValidNumber {

	public static void main(String[] args) {

		String str1 = "10";
		String str2 = "10";
		int num1 = Integer.valueOf(str1);
		int num2 = Integer.valueOf(str2);
		System.out.println("string is a valid number" + num1 + " and " + num2 + " sum:- " + (num1 + num2));
	}

}

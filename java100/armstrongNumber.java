
//Implement a program to check if a number is Armstrong.

package java100;

public class armstrongNumber {

	public static void main(String[] args) {

		int num = 371;
		int orgNum = num;
		int orgNum2 = num;
		int i = 0;
		int sum = 0;

		while (num != 0) {
			num /= 10;
			i++;
		}

		while (orgNum != 0) {

			int mod = orgNum % 10;
			sum += (int) Math.pow(mod, i);
			orgNum /= 10;

		}

		if (orgNum2 == sum) {
			System.out.println("Given number is Armstrong number");
		} else {

			System.out.println("Given number is not Armstrong number");
		}
	}

}


//44. Implement a program to check if a given number is a happy number.

package java100;

import java.util.Scanner;

public class happyNumber {

	public static int happyNum(int num) {

		int sum = 0;
		while (num != 0) {

			sum += (num % 10) * (num % 10);
			num /= 10;
		}

		return sum;

	}

	public static void main(String[] args) {

		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int temp = num;
		while (temp > 9) {

			temp = happyNum(temp);
		}

		if (temp == 1) {
			System.out.println(num + " is a Happy number");
		} else {

			System.out.println(num + " is not a Happy number");
		}

	}

}

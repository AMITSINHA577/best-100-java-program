
//Write a program to find the sum of all prime numbers up to a given limit.

package java100;

import java.util.Scanner;

public class primeNumbersSum {

	public static void main(String[] args) {

		System.out.print("Enter the starting value: ");
		Scanner sc = new Scanner(System.in);
		int starting = sc.nextInt();
		System.out.print("Enter the ending value: ");
		int ending = sc.nextInt();

		int sum = 0;

		for (int h = starting; h <= ending; h++) {
			int count = 0;
			int a = 2;
			while (a <= h / 2) {
				if (h % a == 0) {
					count++;
					break;
				}
				a++;
			}
			if (count == 0) {
				sum += h;
			}

		}
		System.out.println(sum);

	}

}

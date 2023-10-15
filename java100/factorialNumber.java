package java100;

public class factorialNumber {

	public static void main(String[] args) {

		int num = 9;
		int factorial = 1;
		for (int i = 1; i <= num; i++) {

			factorial *= i;
		}

		System.out.println(" Factorial of " + num + " is: " + factorial);

	}

}

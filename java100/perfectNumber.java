package java100;

public class perfectNumber {

	public static void main(String[] args) {

		int num = 28;
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println("Number is perfect number");
		} else {

			System.out.println("Number is not perfect number");
		}
	}

}

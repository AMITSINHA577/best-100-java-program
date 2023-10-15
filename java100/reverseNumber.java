package java100;

public class reverseNumber {

	public static void main(String[] args) {

		int num = 1234;

		while (num != 0) {

			int mod = num % 10;
			System.out.print(mod);
			num /= 10;
		}

	}

}

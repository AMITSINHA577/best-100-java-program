package java100;

public class numberIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1234321;
		int orgNum = num;
		int rev = 0;
		while (num != 0) {

			int mod = num % 10;
			rev = (rev * 10) + mod;
			num /= 10;
		}
		if (rev == orgNum) {
			System.out.println("number is palindrom");
		} else {
			System.out.println("not palindrom");
		}

	}

}

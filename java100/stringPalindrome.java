package java100;

public class stringPalindrome {

	public static void main(String[] args) {

		String str = "maam";
		int len = str.length();
		char ch[] = str.toCharArray();

		boolean flage = true;
		for (int i = 0; i < len / 2; i++) {

			if (ch[i] != ch[len - i - 1]) {
				flage = false;
			}
		}
		if (flage) {
			System.out.println("String is palindrome");
		} else {

			System.out.println("String is not palindrome");
		}
	}

}

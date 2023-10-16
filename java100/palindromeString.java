
//	Q: Write code Check if the given string is Palindrome or not

package java100;

public class palindromeString {

	public static void main(String[] args) {

		String str = "maam";

		char ch[] = str.toCharArray();
		int strLen = str.length();
		Boolean flage = true;

		for (int i = 0; i < strLen / 2; i++) {

			if (ch[i] != ch[strLen - i - 1]) {
				flage = false;
				break;
			}

		}

		if (flage) {
			System.out.println("Given string is Palindrome");
		} else {

			System.out.println("Given string is not Palindrome");
		}
	}

}

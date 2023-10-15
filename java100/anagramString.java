package java100;

import java.util.Arrays;

public class anagramString {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "bdac";

		if (str1.length() == str2.length()) {

			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean result = Arrays.equals(ch1, ch2);

			if (result) {
				System.out.println("string is anagram");
			} else {
				System.out.println("string is not anagram");
			}
		} else {
			System.out.println("string is not anagram");
		}
	}
}

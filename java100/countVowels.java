
//43. Write a program to find the number of vowels and consonants in a string.

package java100;

public class countVowels {

	public static void main(String[] args) {

		String str = "amitsinha";
		char ch[] = str.toCharArray();

		int vol = 0;
		int con = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {

				vol++;
			} else {

				con++;
			}
		}
		System.out.println("the number of vowels " + vol + " and consonants " + con + " in a " + str + " string:");

	}

}

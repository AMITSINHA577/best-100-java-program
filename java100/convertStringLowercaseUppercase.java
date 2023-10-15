// How to convert a string to lowercase or uppercase

package java100;

public class convertStringLowercaseUppercase {

	public static void main(String[] args) {

		String str = "AMIT";
		char ch[] = str.toCharArray();

		int firstStr = ch[0];

		if (firstStr >= 97 && firstStr <= 122) {

			String lowercase = "";
			for (int i = 0; i < ch.length; i++) {

				int temp = ch[i];
				temp -= 32;
				lowercase += (char) temp;
				temp = 0;
			}
			System.out.println(lowercase);
		} else {

			String uppercase = "";
			for (int i = 0; i < ch.length; i++) {
				int temp = ch[i];
				temp += 32;
				uppercase += (char) temp;
				temp = 0;
			}
			System.out.println(uppercase);

		}

	}

}

package java100;

public class removeWhitespaceString {

	public static void main(String[] args) {

		String str = "amit sinha ji n n n n m";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				System.out.print(ch);
			}
		}

	}

}

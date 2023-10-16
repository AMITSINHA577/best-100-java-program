package java100;

public class rotationString {

	public static boolean rotation(String str, String rostr) {

		if (str.length() != rostr.length()) {
			return false;
		} else if (str == null || rostr == null) {
			return false;
		} else {
			String newstr = str + str;

			return newstr.contains(rostr);
		}

	}

	public static void main(String[] args) {
		boolean ans = rotation("abcd", "bcda");
		if (ans) {
			System.out.println("Yes string is a rotation of another string");
		} else {
			System.out.println("NO string is a rotation of another string");
		}
	}
}

package java100;

public class rotationString {

	public static void main(String[] args) {

		String str1 = "AACD";
		String str2 = "ACDA";

		String ans = str1 + str2;

		if (ans.contains(str2)) {
			System.out.println("Yes string is a rotation of another string");
		} else {
			System.out.println("NO string is a rotation of another string");
		}

	}

}

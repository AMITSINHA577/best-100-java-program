package java100;

public class reverseString {

	public static void main(String[] args) {

		String str = "amit sinha";
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		System.out.println(rev);

	}

}


//Q How to find the length of a string?

package java100;

public class findLengthString {

	public static void main(String[] args) {

		String str = "amit";

		int count = 0;

		for (int i : str.toCharArray()) {
			count++;
		}
		System.out.println("String of string is: " + count);

	}

}

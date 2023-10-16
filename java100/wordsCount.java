
//Q: how to count number of words in a string in java ?

package java100;

public class wordsCount {

	public static void main(String[] args) {

		String str = "my name is Amit sinha";

		String strArr[] = str.split(" ");
		int count = 0;

		for (int i = 0; i < strArr.length; i++) {
			count++;
		}

		System.out.println("number of words count in a string: " + count);
	}

}

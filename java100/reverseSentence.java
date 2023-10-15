package java100;

public class reverseSentence {

	public static void main(String[] args) {

		String str = "Hi My Name Is Amit Sinha";

		String word[] = str.split(" ");
		String revStr = " ";

		for (int i = word.length - 1; i >= 0; i--) {

			revStr += word[i] + " ";
		}

		System.out.println(revStr);
	}

}

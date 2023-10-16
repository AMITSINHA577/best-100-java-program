
//	#Q27.1   Factorial Program using..... recursion.... in java

package java100;

public class factorialUseingRecursion {

	public static int fact(int num) {

		if (num == 0) {
			return 1;
		} else {
			return (num * fact(num - 1));
		}
	}

	public static void main(String[] args) {

		int number = 4;
		int ans = fact(number);
		System.out.println("Factorial of givine number is: "+ans);

	}
}

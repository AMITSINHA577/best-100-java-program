
//Q: Write the code to find the Fibonacci series upto the nth term.

package java100;

public class fibonacciSeries {

	public static void main(String[] args) {

		int num = 10;
		int a = 0;
		int b = 1;
		System.out.print(a + ", " + b + ", ");
		for (int i = 2; i <= num; i++) {

			int temp = a + b;
			System.out.print(temp + ", ");
			a = b;
			b = temp;

		}
	}

}

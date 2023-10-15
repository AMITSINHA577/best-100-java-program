package java100;

public class squareRoot {

	public static void main(String[] args) {

		int num = 9;

		double temp;
		double sr = num / 2;

		do {
			temp = sr;
			sr = (temp + (num / temp)) / 2;
		} while ((temp - sr) != 0);
		{
			System.out.println("Square root of a number is " + sr);
		}

	}

}


//Q: Write code of Greatest Common Divisor GCD(HCF) and LCM

package java100;

public class Lcm_Hcf {

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 4;
		int hcf = 1;
		int minNum = 0;
		if (num1 > num2) {
			minNum = num2;
		} else {
			minNum = num1;
		}

		for (int i = 1; i <= minNum; i++) {

			if (num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}

		}
		if (hcf == 0) {
			System.out.println("not found lcm");
		} else {
			System.out.print(num1 + "," + num2 + " HCF is: " + hcf);
		}

		System.out.println(" and LCM is: " + (num1 * num2) / hcf);
	}

}

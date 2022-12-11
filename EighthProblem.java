package second;

import java.math.BigInteger;

public class EighthProblem {

	/*
	 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 * 
	 * What is the sum of the digits of the number 2^1000?
	 */

	public static void main(String[] args) {

		BigInteger number = new BigInteger("1");

		for (int i = 1; i <= 1000; i++) {

			number = number.multiply(BigInteger.TWO);

		}
		System.out.println(number);
		BigInteger total = new BigInteger("0");
		int control = number.compareTo(BigInteger.ZERO);
		System.out.println("control :" + control);
		while (control != 0) {

			total = number.mod(BigInteger.TEN).add(total);
			number = number.subtract(number.mod(BigInteger.TEN)).divide(BigInteger.TEN);
			control = number.compareTo(BigInteger.ZERO);
		}
		System.out.println(total);

	}

}

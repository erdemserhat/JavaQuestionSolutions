package second;

public class SeventhProblem {

	/*
	 * Find the difference between the sum of the squares of the first one hundred
	 * natural numbers and the square of the sum.
	 * 
	 */
	static long Square() {
		int total = 0;
		for (int i = 1; i <= 100; i++) {

			total += i;
		}

		return (long) (Math.pow(total, 2));
	}

	static long Square2() {
		int total = 0;
		for (int i = 1; i <= 100; i++) {

			total += Math.pow(i, 2);

		}
		return (long) (total);

	}

	public static void main(String[] args) {
		long result = Square() - Square2();
		System.out.println(result);
	}

}

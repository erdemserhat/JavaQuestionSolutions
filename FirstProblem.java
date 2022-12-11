package projecteuler;

import java.util.Scanner;

public class FirstProblem {

	public static void main(String[] args) {

		// First Problem

		// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
		// that the 6th prime is 13. What is the 10 001st prime number?
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the amunt of prime number that you want to find..");
		int targetAmount = input.nextInt();
		int theAmountOfPrimeNumbers = 0;
		int theNumberControlled = 2;
		boolean control = true;

		while (targetAmount != theAmountOfPrimeNumbers) {
			control = true;
			for (int i = 2; i <= theNumberControlled / 2; i++) {

				if (theNumberControlled % i == 0)
					control = false;

			}
			if (control)
				theAmountOfPrimeNumbers += 1;

			theNumberControlled += 1;

		}

		System.out.println(theNumberControlled - 1);

	}

}

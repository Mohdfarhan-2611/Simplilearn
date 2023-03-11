package Test2;

import java.util.Scanner;

public class PrimeNumber {

	Scanner s = new Scanner(System.in);
	int number = s.nextInt();
	int prime = 0;

	void isPrime() {
		if (number < 0 || number == 0 || number == 1) {
			System.out.println("Number is not prime");
		}

		else if (number == 2) {
			System.out.println("Number is prime");
		}

		else {
			for (int i = 2; i <= number - 1; i++) {
				if (number % i == 0) {
					System.out.println("Number is not prime");
					prime = 1;
					break;
				}
			}
			if (prime == 0) {
				System.out.println("Number is prime");
			}
		}
			
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		
		PrimeNumber p = new PrimeNumber();
		p.isPrime();

	}

}

package numerical_coding;

import java.util.Scanner;

public class Factors_of_a_number {

	public static void main(String[] args) {

		// scanner class declaration
		Scanner sc = new Scanner(System.in);
		// input from user
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("Factors of " + number + " are :");
		// loop for finding factors of a number
		for (int i = 1; i <= number; i++) {
			
			if (number % i == 0)
				// printing factors
				System.out.println(i);
		}
		// closing scanner class(not compulsory, but good practice)
		sc.close();

	}

}

package numerical_coding;

import java.util.Scanner;

public class Sum_of_digits_of_number {

	public static void main(String[] args) {

		// scanner class declaration
		Scanner sc = new Scanner(System.in);
		// input from user
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		// declare a variable to store sum of digits
		int sod = 0;
		while (number != 0) {
			int pick_last = number % 10;
			sod = sod + pick_last;
			number = number / 10;
		}
		// display sum of digits
		System.out.println("Sum of Digits = " + sod);
		// closing scanner class(not compulsory, but good practice)
		sc.close();

	}

}

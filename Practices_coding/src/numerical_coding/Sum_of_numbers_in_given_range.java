package numerical_coding;

import java.util.Scanner;

public class Sum_of_numbers_in_given_range {

	public static void main(String[] args) {

			// scanner class declaration
		Scanner sc = new Scanner(System.in);
		// input from user
		System.out.println("Enter starting number : ");
		int start = sc.nextInt();
		System.out.println("Enter ending number : ");
		int end = sc.nextInt();
		// declare a variable to store sum
		int sum = 0;
		// loop to add n natural numbers
		for (int i = start; i <= end; i++)
			sum = sum + i;
		// display the sum
		System.out.println("Sum of numbers in  range from " + start + " to " + end + " is " + sum);
		// closing scanner class(not compulsory, but good practice)
		sc.close();
	}

}

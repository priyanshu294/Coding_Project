package numerical_coding;

import java.util.Scanner;

public class Reverse_of_number {

	public static void main(String[] args) {

		// scanner class declaration
		Scanner sc = new Scanner(System.in);
		// input from user
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("Reverse of number is ");
		String s = "";
		while (number != 0) {
			
			int pick_last = number % 10;
			// use function to convert pick_last from integer to string
			s = s + Integer.toString(pick_last);
			number = number / 10;
		}
		// display the reversed number
		System.out.println(s);
		// closing scanner class(not compulsory, but good practice)
		sc.close();
		
	}

}

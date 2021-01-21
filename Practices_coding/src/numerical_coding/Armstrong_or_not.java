package numerical_coding;

import java.util.Scanner;

public class Armstrong_or_not {

	public static void main(String[] args) {

		// scanner class declaration
		Scanner sc = new Scanner(System.in);
		// input from user
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		int n = number;
		int sum = 0;
		while (n != 0) {
			
			int pick_last = n % 10;
			sum = sum + (pick_last * pick_last * pick_last);
			n = n / 10;
		}
		// condition for checking that the sum is equal to the number or not
		if (sum == number)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		// closing scanner class(not compulsory, but good practice)
		sc.close();

	}

}

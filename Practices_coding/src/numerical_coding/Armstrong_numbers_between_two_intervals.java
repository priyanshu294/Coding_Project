package numerical_coding;

import java.util.Scanner;

public class Armstrong_numbers_between_two_intervals {

	public static void main(String[] args) {

		// scanner class declaration
		Scanner sc = new Scanner(System.in);
		// input from user
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		System.out.println("Armstrong numbers between " + start + " and " + end + " are : ");
		int n, sum;
		// loop for finding and printing all prime numbers between given range
		for (int i = start; i <= end; i++) {
			n = i;
			sum = 0;
			// logic for checking number is armstrong or not
			while (n != 0) {
				
				int pick_last = n % 10;
				sum = sum + (pick_last * pick_last * pick_last);
				n = n / 10;
			}
			if (sum == i)
				System.out.println(i);
		}
		// closing scanner class(not compulsory, but good practice)
		sc.close();
	}

}

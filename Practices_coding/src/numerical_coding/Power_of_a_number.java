package numerical_coding;

import java.util.Scanner;

public class Power_of_a_number {

	public static void main(String[] args) {

		// scanner class declaration
		Scanner sc = new Scanner(System.in);
		// input base value and exponent value from user
		System.out.print("Enter the value of base : ");
		int base = sc.nextInt();
		System.out.print("Enter the value of exponent : ");
		int exp = sc.nextInt();
		// declare an integer variable to store the result
		int result = 1;
		// logic for calculating power of the entered number
		while (exp != 0) {
			result = result * base;
			--exp;
		}
		 
		//result = (int) Math.pow(7, 2);
		// print the result
		System.out.println("Answer = " + result);
		// closing scanner class(not compulsory, but good practice)
		sc.close();
	}

}

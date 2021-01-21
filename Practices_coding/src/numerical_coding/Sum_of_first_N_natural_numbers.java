package numerical_coding;

import java.util.Scanner;

public class Sum_of_first_N_natural_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vlue of n");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++)
		sum = sum + i;
		System.out.println("Sum is " + sum);
	}

}

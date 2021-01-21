package numerical_coding;

import java.util.Scanner;

public class Fibonacci_series_up_to_n {

	public static void main(String[] args) {

		// scanner class declaration
		Scanner sc = new Scanner(System.in);
		// input from user
		System.out.print("Enter the limit : ");
		int lim = sc.nextInt();
		if (lim > 0) {
			int y = 0, z = 1, s;
			// display starting two numbers of series
			System.out.print("Fibonacci Series : " + y + "  " + z + "  ");
			// perform iterations till the limit entered by the user
			while (z <= lim) {
				s = y + z;
				y = z;
				z = s;
				// condition for forcing z that it should not be printed when its value is
				// greater than limit
				if (z <= lim)
					System.out.print(z + "  ");
			}
		} else
			System.out.print("Wrong Input");
		// closing scanner class(not compulsory, but good practice)
		sc.close();

	}

}

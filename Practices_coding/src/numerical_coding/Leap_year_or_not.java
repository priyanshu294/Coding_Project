package numerical_coding;

import java.util.Scanner;

public class Leap_year_or_not {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year");
		int year = sc.nextInt();
		
		//condition for checking year entered by user is a leap year or not
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");

		}
		sc.close();
		
	}

}

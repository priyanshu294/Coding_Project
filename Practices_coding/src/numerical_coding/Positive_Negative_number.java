package numerical_coding;

import java.util.Scanner;

public class Positive_Negative_number {
	
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from the user
		System.out.print("Enter a Number : ");
		int numb = sc.nextInt();
		//condition for positive
		if(numb > 0)
			System.out.println("Positive");
		//condition for negative
		else if(numb < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		//closing scanner class(not compulsory, but good practice)
		sc.close();
	}

}

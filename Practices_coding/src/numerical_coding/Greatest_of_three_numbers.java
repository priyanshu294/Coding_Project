package numerical_coding;

import java.util.Scanner;

public class Greatest_of_three_numbers {

	public static void main(String[] args) {
	
		//scanner class declaration
				Scanner sc = new Scanner(System.in);
				//input three numbers from user
				System.out.println("Enter the first number : ");				
				int first = sc.nextInt();
				System.out.println("Enter the second number : ");
				int second = sc.nextInt();
				System.out.println("Enter the third number : ");	
				int third = sc.nextInt();
			
				//condition for first number
				if(first > second && first > third)							
					System.out.println(first+" is the greatest number.");
				//condition for second number
				else if(second > first && second > third)					
					System.out.println(second+" is the greatest number.");
				//condition for third number		
				else if(third > first && third > second)					
					System.out.println(third+" is the greatest number.");	
				//condition when all three numbers are equal
				else														
					System.out.println("All three numbers are equal");
				//closing scanner class(not compulsory, but good practice)
				sc.close();			
	}

}

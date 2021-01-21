package numerical_coding;

import java.util.Scanner;


public class Number_is_Prime_or_Not {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in); // scanner class object creation
//
//		System.out.println("Enter a number");
//		int n = sc.nextInt(); // taking a number n as input
//		int count = 0;
//		for (int i = 1; i <= n; i++) {
//			
//			if (n % i == 0) // condition for getting the factors of number n
//				count = count + 1;
//		}
//		if (count == 2) // if factors are two then, number is prime else not
//			System.out.println("Prime Number");
//		else
//			System.out.println("Not a Prime Number");
//		sc.close();
		
		//scanner class object creation
				Scanner sc=new Scanner(System.in);
				//input from user
				System.out.print("Enter Starting Number : ");
				int start = sc.nextInt();
				System.out.print("Enter Ending Number : ");
				int end = sc.nextInt();
				System.out.println("Prime numbers between "+start+" and "+end+" are : ");
				int count;
				int total_prime = 0 ;
				//loop for finding and printing all prime numbers between given range
				for(int i = start ; i <= end ; i++)
				{
					//logic for checking number is prime or not
					count = 0;
					for(int j = 1 ; j <= i ; j++)	
					{
						if(i % j == 0)
							count = count+1;
						
					}
					if(count == 2)
						System.out.println(i);
					total_prime = total_prime + i;
					
					System.out.println(total_prime);
				}
				//closing scanner class(not mandatory but good practice)
				sc.close();
	}

}

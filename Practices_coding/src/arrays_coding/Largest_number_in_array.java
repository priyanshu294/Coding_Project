package arrays_coding;

import java.util.Scanner;

public class Largest_number_in_array {

	public static void main(String[] args) {

		System.out.print("Enter the length of the array : ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[50];
		System.out.print("Enter the elements of the array : ");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		int large = arr[0];
		for (int i = 0; i < len; i++) {
			
			if (arr[i] > large) {
				
				large = arr[i];
			}
		}
		System.out.print("The largest element of the array : " + large);
	}

}

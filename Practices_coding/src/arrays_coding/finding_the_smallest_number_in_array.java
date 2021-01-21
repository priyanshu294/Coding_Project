package arrays_coding;

import java.util.Scanner;

public class finding_the_smallest_number_in_array {

	public static void main(String[] args) {

		int min, len, i;
		int arr[] = new int[200];
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Length of the array : ");
		len = scan.nextInt();

		System.out.print("Enter elements in the array : ");
		for (i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
		}

		min = arr[0];

		for (i = 0; i < len; i++) {
			
			if (min > arr[i]) {
				
				min = arr[i];
			}

		}

		System.out.print("Smallest Element of the array is = " + min);
	}

}

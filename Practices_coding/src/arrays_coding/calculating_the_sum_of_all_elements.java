package arrays_coding;

import java.util.Scanner;

public class calculating_the_sum_of_all_elements {

	public static  int sum(int[] arr, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int[] a = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size : ");
		int size = sc.nextInt();
		System.out.print("enter Element : ");
		for (int i = 0; i < size; i++)
			a[i] = sc.nextInt();
		System.out.println("sum = " + sum(a, size));
	}
}

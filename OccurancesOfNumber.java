package MitaliPrograms;

import java.util.Scanner;

public class OccurancesOfNumber {
	// Program to find occurrence of number ( Example, i/p → {1,3,23,45,4,3,23}
	//
	// o/p →
	//
	// 1 → Occurred 1 times
	//
	// 3 → Occurred 2 times
	//
	// 23 → Occurred 2 times
	//
	// 45 → Occurred 1 times
	//
	// 4 → Occurred 1 times
	//
	// Use Scanner function for the input.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int i;

		System.out.println("Please enter a number:");

		int n = input.nextInt();

		int[] a = new int[n];

		int[] occur = new int[n];

		System.out.println("Please enter " + n + " array elements.");

		// for taking input from the user

		for (i = 0; i < a.length; i++) {
			System.out.println("Enter the array element");
			a[i] = input.nextInt();

			occur[i] = -1;
		}

		System.out.println("Sorted elements are given below:");

		// for sorting elements

		for (i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}

			}
			System.out.println(a[i]);
		}

		// to check the occurrence of the element

		for (i = 0; i < a.length; i++) {
			int count = 1;

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					count++;
					occur[j] = 0;

				}

			}
			if (occur[i] != 0) {
				occur[i] = count;
			}
		}

		for (i = 0; i < a.length; i++) {
			if (occur[i] != 0) {

				System.out.println("The ocurrence of " + a[i] + " is " + occur[i]);
			}
		}

	}

}

package MitaliPrograms;

//Write bubble sort program and find O(n) , time complexity and space complexity

import java.util.Scanner;

public class Buuble_sort {

	void bubblesort(int input[]) {
		int inc = 0;
		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {
				System.out.println("Outer pass:" + i);

				System.out.println("Inner pass:" + j);
				System.out.println();

				int temp;

				if (input[i] > input[j]) {
					temp = input[j];

					input[j] = input[i];

					input[i] = temp;

					inc++;

					System.out.println(inc + " Iteration: " + input[i] + " " + input[j]);
					System.out.println();
				}
			}
		}
	}

	void print_bubblesort(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");

			// System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buuble_sort bs = new Buuble_sort();

		System.out.println("Enter a number: ");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] input = new int[n];

		for (int i = 0; i < input.length; i++) {
			System.out.println("Enter numbers to sort: ");

			input[i] = sc.nextInt();

		}

		bs.bubblesort(input);

		System.out.print("Sorted array given below: ");

		bs.print_bubblesort(input);

	}

}
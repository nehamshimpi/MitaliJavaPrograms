package MitaliPrograms;

import java.util.Scanner;

//Write Java program to find first big, second big and third biggest number ( Take user input, use
//scanner function)

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int i;

		System.out.println("Please enter a number:");

		int n = input.nextInt();

		int[] a = new int[3];

		System.out.println("Please enter " + n + " array elements.");

		for (i = 0; i < n; i++) {
			a[i] = input.nextInt();

			System.out.println("The entered number is " + a[i] + ".");
		}

		for (i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp;

					temp = a[i];

					a[i] = a[j];

					a[j] = temp;

				}
			}
		}
		System.out.println("The numbers are in desceding order given below:");

		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}

package MitaliPrograms;

import java.util.Scanner;

//Write Java program to find factorial of number

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");

		int number = sc.nextInt();

		System.out.println("The entered numbers is " + number + ".");

		int ans = 1;

		for (int i = number; i > 0; i--) {

			ans = ans * i;

		}
		System.out.println("The factorial of the number " + number + " is " + ans + ".");
	}
}
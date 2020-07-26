package MitaliPrograms;

import java.util.Scanner;

public class Number_pos_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();

		System.out.println("The numbers is " + number);
		if (number > 0) {
			System.out.println("The entered number " + number + " is postive.");
		} else if (number < 0) {
			System.out.println("The entered number " + number + " is negative.");
		} else {
			System.out.println("The entered number is unknown.");
		}

	}

}
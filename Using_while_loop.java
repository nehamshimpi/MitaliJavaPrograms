package MitaliPrograms;

import java.util.Scanner;

public class Using_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		// System.out.println("Enter the number:");

		int i = 1;
		while (i <= n) {
			int j = 0;
			while (j < i) {
				System.out.print("*");
				j++;
			}
			System.out.println();

			i++;

		}

	}

}
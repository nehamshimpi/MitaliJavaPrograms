package MitaliPrograms;

import java.util.Scanner;

public class Diamond1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers:");
		int k;
		int noOfRows = sc.nextInt();

		int midRow = (noOfRows) / 2;

		int row = 1;

		for (int i = midRow; i > 0; i--) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= row; j++) {
				System.out.print("* ");

				// System.out.print(" ");

			}

			System.out.println();
			row++;
		}

		for (int i = 0; i <= midRow; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = row; j > 0; j--) {
				System.out.print("* ");

				// System.out.print(" ");

			}

			System.out.println();
			row--;
		}

	}

}
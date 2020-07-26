package MitaliPrograms;

//Swap two variable with out using third variable

import java.util.Scanner;

public class Swap_2_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter two number:");
		
		int a=s.nextInt();
		
		int b=s.nextInt();
		
		a=a+b;
		
		b=a-b;
		
		a=a-b;
		
		System.out.print("Swapped numbers are: "+a+" "+b);
		
	}

}
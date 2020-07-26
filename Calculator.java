package MitaliPrograms;

//read value from user and do calcualtion

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter two values:");
		double a= sc.nextInt();
		double b= sc.nextInt();
		System.out.println("Please enter an desired operation:-");
		char operation=sc.next().charAt(0);
		
		
		if (operation=='+')
		{
			System.out.println("The addition of these values is "+(a+b));
		}
		if (operation=='-')
		{
			if(a>b)
			{
			System.out.println("The subtration of these values is "+(a-b));
			}
			else if(b>a) {
				System.out.println("The subtration of these values is "+(b-a));
			}
		}
		if (operation=='*')
		{
			System.out.println("The multiplication of these values is "+(a*b));
		}
		if(operation=='/')
		{
			if(a>b)
			{
				System.out.println("The division of these values is "+(a/b));

			}
			else if(b>a) {
				System.out.println("The division of these values is "+(b/a));
			}
		}
		
	}

}
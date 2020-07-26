package MitaliPrograms;

import java.util.Scanner;

//Write a java program to find largest of 3 numbers using if..else...if

public class largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.out.println("Enter the number:");
		
	       Scanner sc= new Scanner(System.in);
	       
	       int a=sc.nextInt();
	       
	       int b=sc.nextInt();
	       
	       int c=sc.nextInt();
    
     System.out.println("The numbers are: "+a+" "+b+" "+c);
     
		if(a>b && a>c)
		{
			 System.out.println("The greatest number is "+a);
		}
		else if(b>c)
		{
			System.out.println("The greatest number is "+b);
		}
		else
			System.out.println("The greatest number is "+c);
	}

}
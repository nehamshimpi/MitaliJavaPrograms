package MitaliPrograms;

import java.util.Scanner;

public class array_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,fib;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of array:");
		for(i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    
			System.out.println("The entered number is:"+a[i]);
			

		}
		
		
		
		
		
	}

}
package MitaliPrograms;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,ans,fib;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			fib=i-1;
			ans=i+fib;
		    
			System.out.println("The entered number is:"+ans);
		}
		
		
	}

}

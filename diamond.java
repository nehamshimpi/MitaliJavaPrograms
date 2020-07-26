package MitaliPrograms;

import java.util.Scanner;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers:");
		
		int n=sc.nextInt();
		
		int k;
		
		for(int i=0;i<n;i++)
		{
			for(k=1;k<=n;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
				System.out.print("  ");
				
			}
		
			System.out.println();
		}	
			
		for(int i=n-1;i>0;i--)
			{
				for(k=1;k<=n;k++)
				{
					System.out.print(" ");
				}
				
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
					
					System.out.print("  ");
					
				}
				
				System.out.println();
			}

	}

}
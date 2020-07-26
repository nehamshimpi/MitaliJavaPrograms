package MitaliPrograms;

import java.util.Scanner;

public class for_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Enter the number:");
//
//		Scanner sc= new Scanner(System.in);
		
		int[] n= {1,2,3,4,5,6};
		
		//System.out.println("The number is: "+n);
		
	//	int[] a=new int[n];
		
		for(int i: n)
		{
			System.out.println("The number is: "+ i);	
			
			for(int j: n)
			{
				int ans=i+j;
				System.out.println("The addition of two numbers is: "+ ans);
			}
		}
		
		
	}

}
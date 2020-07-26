package MitaliPrograms;

import java.util.Scanner;

//Convert digits to string ( i/p → 1253 → One Two five three)



public class digit_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		System.out.println("The number is: "+n);
		
		String s=String.valueOf(n);
		 //String s=Integer.toString(n, n);
	
		for(int i=0;i<s.length();i++)
	{
			int j=Character.digit(s.charAt(i), 10);
			
			if(j==0)
			{
				System.out.println("zero ");
				
			}
			if(j==1)
			{
				System.out.print("one ");
				
			}
			if(j==2)
			{
				System.out.print("two ");
				
			}
			if(j==3)
			{
				System.out.print("three ");
				
			}
			if(j==4)
			{
				System.out.print("four ");
				
			}
			if(j==5)
			{
				System.out.print("five ");
				
			}
			if(j==6)
			{
				System.out.print("six ");
				
			}
			if(j==7)
			{
				System.out.print("seven ");
				
			}
			if(j==8)
			{
				System.out.print("eight ");
				
			}
			if(j==9)
			{
				System.out.print("nine ");
				
			}
			
		}
		
	}
}
package MitaliPrograms;

import java.util.Scanner;

public class square {
		
		int cal(int s)
		{
			return s*s;
		}
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
		      System.out.println("Enter the number:");
		      int a=sc.nextInt();
		
		  
		      square sq=new square();
		      sq.cal(a);
		      System.out.println("The area of square is: "+ sq.cal(a));
			
			
		}
	}
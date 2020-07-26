package MitaliPrograms;

import java.util.Scanner;
public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a string:");
	
	    String str=input.nextLine();
		
		System.out.println("The string is "+str);
		
		int length=str.length();
		
		String rev=" ";
		
		for(int i=length-1;i>=0;i--)
		{
			
			rev = rev + str.charAt(i);
			
		
		}
		System.out.println("The reverse string is "+rev);
		
      
		
	}

}
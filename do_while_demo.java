package MitaliPrograms;

import java.util.Scanner;

public class do_while_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number:");
		
       Scanner sc= new Scanner(System.in);
       
       int n=sc.nextInt();
       
       
       int i=n;
       do {
    	   System.out.println(i);
    	   i--;
       }while(i>=0);

	}

}
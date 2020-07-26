package MitaliPrograms;

import java.util.Scanner;

public class Perimeter {

	//int side1, side2, side3, side4;
	
	void peri(int side1, int side2, int side3, int side4)
	{
		System.out.println(side1+side2+side3+side4);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	      System.out.println("Enter the number:");
	      int a=sc.nextInt();
	      int b=sc.nextInt();
	      int c=sc.nextInt();
	      int d=sc.nextInt();
	      
		Perimeter p=new Perimeter();
		p.peri(a,b,c,d);
		
	}
}
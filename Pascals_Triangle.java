package MitaliPrograms;

import java.util.Scanner;

public class Pascals_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers:");
		
		int noOfRows=sc.nextInt();
		
		for (int i = 0; i <= noOfRows; i++)
		{
		   int num = 1, row = i + 1;
		   
		    for (int j = noOfRows - i; j > 0; j--)
		    {
		        System.out.print(" ");
		    }
		    
		    for (int col = 0; col <= i; col++)
		    {
		        if (col > 0) 
		        {
		            num = num * (row - col) / col;
		        }
		        System.out.print(num + " ");
		        
		    }
		    
		    System.out.println();
		}

}
}
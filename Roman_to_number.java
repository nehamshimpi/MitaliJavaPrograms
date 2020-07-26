package MitaliPrograms;

//Convert roman number to integer number ( Ex: Roman V → 5, Roman XI ➔ 11)

import java.util.Scanner;


public class Roman_to_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter roman letter:");
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		String s1= s.toUpperCase();
		
	    int result = 0;
	    
		int[] num = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		
		String[] roman_letter = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

     for (int i = 0; i < num.length; i++ )
     {
        while (s1.indexOf(roman_letter[i]) == 0) 
        {
            result += num[i];
            
           s1 = s1.substring(roman_letter[i].length());
        }
     }
     
    System.out.println("The conversion of roman letter"+ "----> " + result);
   
		
		
	}

}
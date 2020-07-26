package MitaliPrograms;

//Reverse word in a string ( Example: I/p → “ I am good boy” o/p → ”I ma doog yob”

import java.util.Scanner;

public class Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
     System.out.print("Original string is : ");

     String Str = scanner.nextLine();
     

     String words[] = Str.split("\\s");
     
     String revWord = "";

     for (int i = 0; i < words.length; i++) 
     {
         String word = words[i];
         
         String rev = "";
         
         for (int j = word.length() - 1; j >= 0; j--) 
         {
             rev = rev + word.charAt(j);
         }
         
         revWord = revWord + rev + " ";
     }


     System.out.println("Reversed string : " + revWord);
		

	}

}
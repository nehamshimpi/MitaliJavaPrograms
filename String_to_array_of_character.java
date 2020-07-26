package MitaliPrograms;

//Convert string to array of character. And print characters using a loop(for, while)
import java.util.Scanner;


public class String_to_array_of_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
	      System.out.println("Enter the string:");
	      
	      String str=sc.nextLine();
	      
	      System.out.println("The string is : "+str);
	      
	      char[] ch=new char[str.length()];
	      
	      System.out.println("The characters are:");
	     
	      int i=0;
	      
	      while(i<str.length())
	      {
	    	  ch[i]=str.charAt(i);
	    	  
      	  System.out.println(ch[i]);
      	  
      	  i++;
	      }

	      

	}

}
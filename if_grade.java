package MitaliPrograms;

import java.util.Scanner;

public class if_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		      Scanner sc=new Scanner(System.in);
		      
		      System.out.println("Enter your grade.");
		      int Grade=sc.nextInt();
		      
		      if(Grade>=35 && Grade<=39)
		      {
		    	  System.out.println("Passed");
		      }
		    	  
		      else if(Grade>=40 && Grade<=59)
		    	  {
		    		  System.out.println("Second class");
		    	  } 
		      else  if(Grade>=60 && Grade<=79)
		    		  {
		    			  System.out.println("First class");
		    		  }
		      else if(Grade>=80)
		        		  {
		    				  System.out.println("Distinction");
		        		  }
		    		  
		      else
		    	  System.out.println("Fail");
				

		
	}

}
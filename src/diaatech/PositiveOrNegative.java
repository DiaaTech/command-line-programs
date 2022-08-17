package diaatech;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		/* Write a program that accepts a number from a user and
		   prints whether it is positive or negative.
		   */
	 int number;
     Scanner input = new Scanner(System.in);
     System.out.println("enter number");
     number=input.nextInt();
     input.close();
    
          if (number > 0 ) 
    	   System.out.printf("%d is a Postive number", number);
    	  else if (number < 0) 
    		  System.out.printf("%d is a Negative number",number);
    		  else
    			  System.out.printf("%d  is zero" , number);
    	  
      
    	  
      
      
    			  
    	  }
      }
	



package diaatech;
 import java.util.Scanner;
public class LetterGrader {

	public static void main(String[] args) {
		
		/* Use switch to write a program that accepts a student total marks from 100
		 * and displays the letter grade. Use below information to map mark ranges to grades
		 * >= 90  A
		 * >= 80  B
		 * >= 70  C
		 * >= 60  D
		 * < 60   F
		 * any other input will not be considered and the program should output "invalid input" to console.
		 */
		// solution;
	
               
		       Scanner input = new Scanner(System.in);
		       System.out.println("Please enter score");
		       double score = input.nextDouble();
		       int switch_score = (int) (score/10);
		       System.out.println("switch_score" + switch_score);
		       switch(switch_score) {
		       case  9://90-100
		    	       System.out.println("Grade='A'");
		    	   break;
		       case 8://80-90
		    	   System.out.println("Grade= 'B'");
		    	   break;
		       case 7://70-80
		    	   System.out.println("Grade= 'C'");
		    	   break;
		       case 6://60-70
		    	   System.out.println("Grade= 'D'");
		    	   break;
		       case 5://0-60
		    	   System.out.println("Grade= 'F'");
		    	   break;
		       default:
		    	   System.out.println("sorry enter a valid number");
		       }
	}
}
		       
		       
package diaatech;

import java.util.Scanner;
	
	
public class LetterGrader{
	
	public static void main(String args[]) {
		System.out.println(findGrade(66));
	}

	public static String findGrade(int score) {
		if (score < 0 || score >100)
			return "invalid score";
			
		switch(score/10) {
		case 10:
		case 9:
			return "A";
		
		case 8:
			return "B";
			
		case 7:
			return "C";
			
		case 6:
			return "D";
			
		case 5:
			return "E";
					
		default:
			return "F";
					
				}
	}

}

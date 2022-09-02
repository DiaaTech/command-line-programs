package diaatech;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fahrenheit;
		double celsius;
		System.out.println("What do want do?");
		System.out.println("........................");
		System.out.println("1. Convert degree celsius to fahrenheit");
		System.out.println("2. Convert degree fahrenheit to celsius");
		System.out.println(".........................");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 1 or 2");
		int choice = input.nextInt();
		switch (choice) {
		case 1: System.out.println("Enter celsius temperature");
			celsius = input.nextInt();
			fahrenheit = ((9*celsius/5))+32;
			System.out.println("fahrenheit temperature is = "+ fahrenheit);
			break;
		case 2: System.out.println("Enter fahrenheit temperature");
			fahrenheit = input.nextInt();
			celsius = (fahrenheit-32)*5/9;
			System.out.println("celsius temperature is = " + celsius);
			break;
		default: System.out.println("Please choose valid choice");
		
		}	
	}
}

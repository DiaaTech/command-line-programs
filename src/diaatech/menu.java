package diaatech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		
		PhoneBook obj = new PhoneBook();
		Scanner input = new Scanner(System.in);
		System.out.println("a). Add a contact");
		PhoneBook obj1 = new PhoneBook();
		Scanner input1 = new Scanner(System.in);
		System.out.println("b). Delete a contact");
		Scanner input2 = new Scanner(System.in);
		System.out.println("c). Update a contact");
		Scanner input3 = new Scanner(System.in);
		System.out.println("d). ShowAll contacts");
		Scanner input4 = new Scanner(System.in);
		System.out.println("e). Search a contact");
		System.out.println("Please choose an option a-e: ");
		String choice = input.next();
		
		switch (choice) {
		case "a":
			System.out.println("Enter Name");
			String name = input.next();
			System.out.println("Enter number");
			Long number = input.nextLong();
		    obj.addContact(name, number);
		    break;
		
		case "b": 
			Map<String,String> users = new HashMap<String,String>();
			System.out.println("Enter Name");
			String name1 = input1.next();
			obj1.deleteContact(name1);
			break;
		
		case "c":
			System.out.println("Enter Name: ");
			String name2 = input2.next();
			System.out.println(name2);
			obj.searchContact(choice);
			System.out.println("update contact info here: ");
			String name3 = input2.next();
			Long number1 = input2.nextLong();
			obj.updateContact(name3, number1);
		
	}
	}
}

package diaatech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		  PhoneBook obj= new PhoneBook();
		  Scanner input= new Scanner(System.in);
		  String choice;
		do { 
		
			  System.out. println("A.add a contact");
			  System.out. println("B.delete a contact");
			  System.out. println("C.update a contact");
			  System.out. println("D.display all contacts");
			  System.out. println("E.search a contact");
			  System.out. println("Q.exit application");
			  choice=input.next();
			
			 
			 switch(choice) {
			  case "A" :
			   System.out.println("Enter Name");
		       String name = input.next();
		       System.out.println("Enter number");
		       Long number = input.nextLong();
		       obj.addContact(name, number);
		       System.out.println("Contact added successfully");
	   	       break;
	           case "B":
	           System.out.println("Enter Name");
	           name=input.next();
	           obj.deleteContact(name);
	   	       break;
	           case "C":
	           System.out.println("Enter Name");
	           name=input.next();
	           System.out.println("Enter number");
	           number = input.nextLong();
	           obj.updateContact(name, number);
	   	       break;
	           case "D":
	   	         obj.showAll();
	   	         break;
	           case "E":
	   	       System.out.println("Enter Name");
	   	       name=input.next();
	   	       obj.searchContact(name);
	   	       break;
	           case"Q":
	        	   System.out.println("Enter Name");
	           default:
	        	   System.out.println("Enter valid option");
		
			}
		}while (!choice.equalsIgnoreCase("Q")) ;
	}
}

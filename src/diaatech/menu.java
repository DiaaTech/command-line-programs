package diaatech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		do { 
			  PhoneBook obj= new PhoneBook();
			  Scanner input= new Scanner(System.in);
			  System.out. println("A.add a contact");
			  System.out. println("B.delete a contact");
			  System.out. println("C.update a contact");
			  System.out. println("D.display all contacts");
			  System.out. println("E.search a contact");
			  System.out. println("Q.exit application");
			  String choice=input.next();
			
			 
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
	           number = input.nextLong();
	           obj.deleteContact(name);
	           System.out.println("Contact Deleted successfully");
	   	       break;
	           case "C":
	           System.out.println("Enter Name");
	           name=input.next();
	           System.out.println("Enter number");
	           number = input.nextLong();
	           obj.updateContact(name, number);
	           System.out.println("Contact updated successfully");
	   	       break;
	           case "D":
	   	         obj.showAll();
	   	         break;
	           case "E":
	   	       System.out.println("Enter Name");
	   	       name=input.next();
	   	       obj.searchContact(name);
	   	       break;
	           default:
	   	       System.out.println("enter valid key");
		
			}
		}while (true) ;
	}
}

package diaatech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
<<<<<<< HEAD
		  PhoneBook obj= new PhoneBook();
		  Scanner input= new Scanner(System.in);
		  String choice;
		do { 
		
=======
		
		PhoneBook obj= new PhoneBook();
		Scanner input= new Scanner(System.in);
		String choice;
		
		do { 
			  
>>>>>>> ecfdcd97d7e3459fd8379b319145739497a698f4
			  System.out. println("A.add a contact");
			  System.out. println("B.delete a contact");
			  System.out. println("C.update a contact");
			  System.out. println("D.display all contacts");
			  System.out. println("E.search a contact");
			  System.out. println("Q.exit application");
<<<<<<< HEAD
			  choice=input.next();
=======
			  
			  choice  = input.next();
			  
>>>>>>> ecfdcd97d7e3459fd8379b319145739497a698f4
			
			 
			 switch(choice) {
			  case "A" :
			   System.out.println("Enter Name");
		       String name = input.next();
		       System.out.println("Enter number");
		       Long number = input.nextLong();
		       obj.addContact(name, number);
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
<<<<<<< HEAD
	           case"Q":
	        	   System.out.println("Enter Name");
	           default:
	        	   System.out.println("Enter valid option");
		
			}
		}while (!choice.equalsIgnoreCase("Q")) ;
=======
	   	        
	           case "Q":
	        	 System.out.println("You exited the application");
	             System.exit(0);
	             break;
	            
	           default:
	   	       System.out.println("enter valid option");
	           
			}
		}while (!choice.equalsIgnoreCase("Q") ) ;
		
>>>>>>> ecfdcd97d7e3459fd8379b319145739497a698f4
	}
}

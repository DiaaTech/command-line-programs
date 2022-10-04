package diaatech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {
	Map<String, Long> names = new HashMap<String, Long>();
		
	public void addContact(String name, Long number) {
		
		if(names.containsKey(name)) {
			System.out.println("Contact already exists");
		}
		else {
		names.put(name, number);
		System.out.println("Contact added successfully");
		}
	
	}
	
	public void deleteContact(String name) {
		if(names.containsKey(name)) {
			names.remove(name);
			System.out.println("Contact successfully removed");
		}
		else {
			System.out.println("Contact doesn't exist ");
		
		}
	}
	
	public void updateContact(String name, Long number) {
		if(names.containsKey(name)) {
		names.put(name, number);
		System.out.println("Contact successfully updated");
		}
		else {
			System.out.println("Contact doesn't exit ");
		}
		
	}
	
	public void showAll() {
		if(names.isEmpty()) {
		System.out.println("Phone book is empty");
		}
		else {
			Set<String> thekeys = names.keySet();
			for (String key : thekeys){
				System.out.println(key + "," + names.get(key));
			}
			
		}
	}

	public void searchContact(String name) {
		Set<String> thekeys = names.keySet();
		for(String key : thekeys) {
			if(key.contains(name)) {
			  System.out.println(key + ", " + names.get(key));
			}
		}
		}
}
	
	



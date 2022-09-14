package phonebookProject;

import java.io.IOException;
import java.util.Scanner;

public class Book {

	protected static Person[] pBook = new Person[0];
	protected Scanner in = new Scanner(System.in);
	
//Case 1
	public Person[] addContact(Person person) {
		Person[] temp = new Person[pBook.length + 1];
		for (int i = 0; i < pBook.length; i++) {
			temp[i] = pBook[i];
		}
		temp[temp.length - 1] = person;
		return pBook = temp;
	}
//Case 2
	public static Person findByFirstName() throws IOException { 
		System.out.print("Enter Contact's First Name: ");
		Scanner in = new Scanner (System.in);
		String firstNameFound = in.nextLine();
        for (int i = 0; i <= pBook.length - 1; i++) {
        	if (pBook[i].getFirstName().equalsIgnoreCase(firstNameFound)) {
        		
        		return pBook[i];
        	}
        } 
        throw new IOException("Contact Does Not Exist");
    }
	public static Person findByLastName() throws IOException {
		System.out.print("Enter Contact's Last Name: ");
		Scanner in = new Scanner (System.in);
		String lastNameFound = in.nextLine();
        for (int i = 0; i <=pBook.length - 1; i++) {
        	if (pBook[i].getLastName().equalsIgnoreCase(lastNameFound)) {
        		
        		return pBook[i];
        	}
        }
        throw new IOException("Contact Does Not Exist");
    }

	public static Person findByFullName() throws IOException {
    	System.out.print("Enter the Contact's full Name: ");
    	Scanner in = new Scanner (System.in);
		String firstNameFound = in.nextLine();
		System.out.print("Enter Contact's Last Name: ");
		String lastNameFound = in.nextLine();
        for(Person person : pBook) {           
            if(person.getFirstName().equals(firstNameFound) && person.getLastName().equals(lastNameFound)) {
                return person;
            }
        }
   	throw new IOException("Contact Does Not Exist");
	}
	public static Person findByPhoneNumber() throws IOException {
		System.out.print("Enter Contact's Phone Number: ");
		Scanner in = new Scanner (System.in);
		String phoneNumberFound = in.nextLine();
        for(Person person : pBook) {           
            if(person.getPhoneNumber().equals(phoneNumberFound)) {
            	return person;
            }
        }
         throw new IOException("Contact Does Not Exist");
    }
	public static Person findByCity() throws IOException {
		System.out.print("Enter Contact's City: ");
		Scanner in = new Scanner (System.in);
		String cityFound = in.nextLine();
        for(Person person : pBook) {           
            if(person.getCity().equals(cityFound)) {
                return person;
            }
        }
         throw new IOException("Contact Does Not Exist");
    }
	 public static Person findByState() throws IOException {
			System.out.print("Enter Contact's State: ");
			Scanner in = new Scanner (System.in);
			String stateFound = in.nextLine();
	        for(Person person : pBook) {           
	            if(person.getState().equals(stateFound)) {
	                return person;
	            }
	        }
	        throw new IOException("Contact Does Not Exist");
	    }
//Case 3
	 public static Person replaceByPhoneNumber() throws IOException {
			System.out.print("Enter Contact's Phone Number: ");
			Scanner in = new Scanner (System.in);
			String replacePhoneNumber = in.nextLine();
			for(int i = 0; i < pBook.length; i++) {
				if(pBook[i].getPhoneNumber().equals(replacePhoneNumber)) {
					return updateContact(i);
				}
			}
			throw new IOException("Contact Does Not Exist");
	    }
	 public static Person updateContact(int index){
		 	Scanner in = new Scanner (System.in);
			System.out.print("Enter Contact's First Name: ");
			String firstName = in.nextLine();
			System.out.print("Enter Contact's Last Name: ");
			String lastName = in.nextLine();
			System.out.print("Enter Contact's Phone Number: ");
			String phoneNumber = in.nextLine();
			System.out.print("Enter Contact's email: ");
			String email = in.nextLine();
			System.out.print("Enter Contact's Street Number: ");
			String streetNum = in.nextLine();
			System.out.print("Enter Contact's Street Name: ");
			String streetName = in.nextLine();
			System.out.print("Enter Contact's City: ");
			String city = in.nextLine();
			System.out.print("Enter Contact's State: ");
			String state = in.nextLine();
			Address address1 = new Address(streetNum, streetName, city, state);
			Person person1 = new Person(firstName, lastName, phoneNumber, email, address1);
			pBook[index] = person1;
			return pBook[index];
	 }

//Case 4
	public static boolean deleteByPhoneNumber() throws ArrayIndexOutOfBoundsException {
		System.out.print("Enter Contact's Phone Number: ");
		Scanner in = new Scanner (System.in);
		String deletePhoneNumber = in.nextLine();
		Person[] temp = new Person[0];
		if (pBook.length > 0) {
			temp = new Person[pBook.length - 1];
		}
		for(int i = 0; i < pBook.length; i++) {
			if(!pBook[i].getPhoneNumber().equals(deletePhoneNumber)) {
				temp[i] = pBook[i];
			}
		}
		pBook = temp;
		return true;
	}

//Case 5
	public static void printAllContacts() {
		for(Person person : pBook) {
			System.out.println(person.toString());
		}
	}
}

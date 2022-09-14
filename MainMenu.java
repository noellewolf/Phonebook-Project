package phonebookProject;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

	static Book book = new Book();
	public static void main(String[] args) {
		displayMenu();
	}
	
// MAIN MENU
	
	public static void displayMenu() {
		
		Scanner in = new Scanner(System.in);
		boolean mainLoop = true; 
		
		int choice;
		while(true) {
		System.out.println("----What would you like to do?:----");
		System.out.println("1) - Add New Entry");
		System.out.println("2) - Search for an Existing Entry");
		System.out.println("3) - Delete a Record for a Given Telephone Number");
		System.out.println("4) - Update a Record for a Given Telephone Number");
		System.out.println("5) - Show all Records in Asc Order");
		System.out.println("6) - Exit");
		choice = in.nextInt();
		
// CHOICE SWITCH 
		
		switch(choice) {
		case 1:
			addPerson();
			break;
		case 2: 
			findPerson();
			break;
		case 3:
			book.deleteByPhoneNumber();
			System.out.println("Contact Has Been Deleted!");
			break;
		case 4:
			try {
				book.replaceByPhoneNumber();
				System.out.println("Contact Has Been Updated!");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break; 
		case 5: 
			System.out.println("---Here are your Contacts!---");
			book.printAllContacts();
			break;
		case 6:
			System.out.println("------------");
			System.out.println("- Goodbye! -");
			System.out.println("------------");
			System.exit(0);
			break;
		default : 
			System.out.println("This is not a valid Menu Option.");
			break;
		}
		}
	}
	//case 1:
		private static void addPerson() {
			Scanner input = new Scanner (System.in);
			System.out.print("Enter Contact's First Name & Middle Name(s) if Applicable: ");
			String firstName = input.nextLine();
			System.out.print("Enter Contact's Last Name: ");
			String lastName = input.nextLine();
			System.out.print("Enter Contact's Phone Number: ");
			String phoneNumber = input.nextLine();
			System.out.print("Enter Contact's email: ");
			String email = input.nextLine();
			System.out.print("Enter Contact's Street Number: ");
			String streetNum = input.nextLine();
			System.out.print("Enter Contact's Street Name: ");
			String streetName = input.nextLine();
			System.out.print("Enter Contact's City: ");
			String city = input.nextLine();
			System.out.print("Enter Contact's State & Zip Code if Applicable: ");
			String state = input.nextLine();
			Address address1 = new Address(streetNum, streetName, city, state);
			Person person1 = new Person(firstName, lastName, phoneNumber, email, address1);
			book.addContact(person1);
			
			System.out.println("--" + firstName + " " + lastName + " is Now Saved as a Contact!--");
			System.out.println();
}
	//case 2:
		public static void findPerson() { 
			boolean caseLoop = true; 
			
			while(caseLoop) {
			System.out.println("---How do you Want to Search?---");
			System.out.println("1) - Find with First Name");
			System.out.println("2) - Find with Last Name");
			System.out.println("3) - Find with Full Name");
			System.out.println("4) - Find with Telephone Number");
			System.out.println("5) - Search by City");
			System.out.println("6) - Search by State");
			System.out.println("7) - Exit to Main Menu");
			
			Scanner in = new Scanner(System.in);
			String choice;
			do {
				choice = in.nextLine();
				switch(choice) {
				case "1": 
					try {
						Person foundPerson = book.findByFirstName();
						System.out.println(foundPerson.toString());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					break;
				case "2":
					try {
						Person foundPerson = book.findByLastName();
						System.out.println(foundPerson.toString());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					break;
				case "3":
					try {
						Person foundPerson = book.findByFullName();
						System.out.println(foundPerson.toString());

					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

				case "4":
					try {
						Person foundPerson = book.findByPhoneNumber();
						System.out.println(foundPerson.toString());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

				case "5":
					try {
						Person foundPerson = book.findByCity();
						System.out.println(foundPerson.toString());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

				case "6":
					try {
						Person foundPerson = book.findByState();
						System.out.println(foundPerson.toString());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

				case "7":
					System.out.println("----------------");
					System.out.println("- Returning to -");
					System.out.println("-- Main Menu! --");
					System.out.println("----------------");
				caseLoop = false;
					break;
				default:
					System.out.println("Invalid Entry");
				}
			} while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5") && !choice.equals("6"));
			System.out.println();
			displayMenu();
			}
		}
}
	

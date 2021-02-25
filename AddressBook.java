import java.util.Scanner;

public class Addressbook {

	public String[] entry() {
		Scanner sc = new Scanner(System.in);
		String[] contact = new String[8];
		System.out.println("Enter First Name");
		String first_name = sc.next();
		contact[1] = first_name;
		System.out.println("Enter Last Name");
		String last_name = sc.next();
		contact[2] = last_name;
		System.out.println("Enter City name");
		String city = sc.next();
		contact[3] = city;
		System.out.println("Enter State name");
		String state = sc.next();
		contact[4] = state;
		System.out.println("Enter Zip Code");
		String zip_code = sc.next();
		contact[5] = zip_code;
		System.out.println("Enter Phone number");
		String phone_number = sc.next();
		contact[6] = phone_number;
		System.out.println("Enter e-mail");
		String email = sc.next();
		contact[7] = email;
		return contact;
	}

	public void edit(String[] contact) {
		System.out.println("If you want to edit then press 1 else press 0");
		Scanner sc = new Scanner(System.in);
		int read = sc.nextInt();
		if (read == 1) {
			System.out.println("Press the respective number you want to edit\n1  First Name\n2 Last Name\n3 City"
					+ "\n4 State\n5 zip Code\n6 phone number\n7 email");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter new First Name");
				String newFirstName = sc.next();
				contact[1] = newFirstName;
				break;
			case 2:
				System.out.println("Enter new Last Name");
				String newLastName = sc.next();
				contact[2] = newLastName;
				break;
			case 3:
				System.out.println("Enter new City");
				String newCity = sc.next();
				contact[3] = newCity;
				break;
			case 4:
				System.out.println("Enter new State");
				String newState = sc.next();
				contact[4] = newState;
				break;
			case 5:
				System.out.println("Enter new Zip Code");
				String newZipCode = sc.next();
				contact[5] = newZipCode;
				break;
			case 6:
				System.out.println("Enter your new Phone number");
				String newPhoneNumber = sc.next();
				contact[6] = newPhoneNumber;
				break;
			case 7:
				System.out.println("Enter your new email");
				String newEmail = sc.next();
				contact[7] = newEmail;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("Your new details are as follows");
			for (int j = 0; j < contact.length; j++) {
				System.out.println(contact[j]);
			}
		}
		else if (read == 0) {
			for (int j = 0; j < contact.length; j++) {
				System.out.println(contact[j]);
			}
		}
		else
			System.out.println("Invalid Input");
	}

	public static void main(String[] args) {
		System.out.println("WELCOME to Address Book Program");
		Addressbook contact = new Addressbook();
		String[] info = contact.entry();
		contact.edit(info);
	}
}

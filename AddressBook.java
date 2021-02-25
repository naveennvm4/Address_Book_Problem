import java.util.*;

public class Addressbook {

	public void entry(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String first_name = sc.next();
		System.out.println("Enter Last Name:");
		String last_name = sc.next();
		System.out.println("Enter City:");
		String city = sc.next();
		System.out.println("Enter State:");
		String state = sc.next();
		System.out.println("Enter Zip Code:");
		String pin_code = sc.next();
		System.out.println("Enter Phone number:");
		String phone_number = sc.next();
		System.out.println("Enter e-mail:");
		String email = sc.next();
	}

	public static void main(String[] args) {
		System.out.println("WELCOME to Address Book Problem");
		Addressbook contact = new Addressbook();
		contact.entry();
	}
}

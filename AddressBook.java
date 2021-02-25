import java.util.ArrayList;
import java.util.Scanner;

public class Addressbook{
	Scanner sc = new Scanner(System.in);
	String FIRST_NAME = "";
	String LAST_NAME = "";
	String CITY = "";
	String STATE = "";
	String ZIP_CODE = "";
	String PHONE_NO = "";
	String EMAIL = "";
	static ArrayList<Addressbook> store = new ArrayList<Addressbook>();
	int length = store.size();
	static boolean exit = false;

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public String getFirstname() {
		return FIRST_NAME;
	}

	public void setFirstname(String FIRST_NAME) {
		this.FIRST_NAME = FIRST_NAME;
	}

	public String getLastname() {
		return LAST_NAME;
	}

	public void setLastname(String LAST_NAME) {
		this.LAST_NAME = LAST_NAME;
	}

	public String getCity() {
		return CITY;
	}

	public void setCity(String city) {
		this.CITY = city;
	}

	public String getState() {
		return STATE;
	}

	public void setState(String state) {
		this.STATE = state;
	}

	public String getZip_code() {
		return ZIP_CODE;
	}

	public void setZip_code(String zip_code) {
		this.ZIP_CODE = zip_code;
	}

	public String getPhone_no() {
		return PHONE_NO;
	}

	public void setPhone_no(String phone_no) {
		this.PHONE_NO = phone_no;
	}

	public String getEmail() {
		return EMAIL;
	}

	public void setEmail(String email) {
		this.EMAIL = email;
	}

	public String toString() {
		return "Book [first_name=" + FIRST_NAME + ", last_name=" + LAST_NAME + ", city=" + CITY + ", state=" + STATE
				+ ", zip_code=" + ZIP_CODE + ", phone_no=" + PHONE_NO + ", email=" + EMAIL + "]";
	}

	void add() {
		System.out.println("Enter how many contacts you want to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Addressbook b1 = new Addressbook();
			System.out.println("Enter  first name");
			b1.setFirstname(sc.next());
			System.out.println("Enter last name");
			b1.setLastname(sc.next());
			System.out.println("Enter city");
			b1.setCity(sc.next());
			System.out.println("Enter state");
			b1.setState(sc.next());
			System.out.println("Enter zip code");
			b1.setZip_code(sc.next());
			System.out.println("Enter phone no");
			b1.setPhone_no(sc.next());
			System.out.println("Enter email");
			b1.setEmail(sc.next());
			System.out.println("adding the records " + b1.toString());
			store.add(b1);
			System.out.println(store.toString());
		}
	}
	void edit(){
		System.out.println("Enter first name of contact which you want to edit");
		String firstname=sc.next();
		Addressbook edit=null;
		int indexof_Store=-1;
		for(int index=0; index<=store.size();index++)
		{
			if(store.get(index).getFirstname().equals(firstname))
			{
			edit=store.get(index);
			indexof_Store=1;
		    break;
			}
			else
			{
			System.out.println("Entery invalid");
			break;
			}
		}

		if(indexof_Store==-1)
		{
			System.out.println("Name not found in Book");
		}
		else
		{
			System.out.println("Enter what you to change");
			System.out.println("1.Edit firstname");
			System.out.println("2.Edit lastname");
			System.out.println("3.Edit city");
			System.out.println("4.Edit state");
			System.out.println("5.Edit zip code");
			System.out.println("6.Edit number");
			System.out.println("7.Edit email");
			int change=sc.nextInt();
			switch(change){
			case 1:
				System.out.println("Enter new firstname");
				edit.setFirstname(sc.next());
			    	break;
			case 2:
				System.out.println("Enter new lastname");
				edit.setLastname(sc.next());
			    	break;
			case 3:
				System.out.println("Enter new city");
				edit.setCity(sc.next());
				break;
			case 4:
				System.out.println("Enter new state");
				edit.setState(sc.next());
				break;
			case 5:
				System.out.println("Enter new zip code");
				edit.setZip_code(sc.next());
				break;
			case 6:
				System.out.println("Enter new number");
				edit.setPhone_no(sc.next());
				break;
			case 7:
				System.out.println("Enter new email");
				edit.setEmail(sc.next());
				break;
			}
		}
	}
	void delete(){
		System.out.println("Enter first name of the contact you want to delete");
		String firstname=sc.next();
	   	Addressbook delete=null;
	   	int indexof_store=-1;
	   	for(int index=0; index<=store.size();index++)
	   	{
	   		if(store.get(index).getFirstname().equals(firstname))
	   		{
	   			delete=store.remove(index);
	   		    indexof_store=1;
	   		    break;
	   		}
	   	}
	}

	static void display()
	{
		System.out.println(store.toString());	
	}

	static void end()
	{
		 System.out.println("Thank You");
		 exit=true;
	}
	public static void main(String[] args) {
		while (!exit) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.To Add Contacts");
			System.out.println("2.Display Contacts");
			System.out.println("3.Edit Contact");
			System.out.println("4.Delete Contact");
			System.out.println("5.Exit");
			System.out.println("Enter what you want to do ?");
			int userinput = sc.nextInt();
			switch (userinput){
			case 1:
				new Addressbook().add();
				break;
			case 2:
				display();
				break;
			case 3:
				new Addressbook().edit();
				break;
			case 4:
				new Addressbook().delete();
				break;
			case 5:
				end();
				break;
			}
		}
	}
}

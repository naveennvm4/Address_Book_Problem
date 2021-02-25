public class Addressbook {
	private String FIRST_NAME;
	private String LAST_NAME;
	private String CITY;
	private String STATE;
	private String ZIP_CODE;
	private String PHONE_NO;
	private String EMAIL;

	public Addressbook(String first_name, String last_name,String city, 
						String state, String zip_code, String phone_number, String email) {
		this.FIRST_NAME = first_name;
		this.LAST_NAME = last_name;
		this.CITY = city;
		this.STATE = state;
		this.ZIP_CODE = zip_code;
		this.PHONE_NO = phone_number;
		this.EMAIL = email;
	}

	public static void main(String[] args) {
		System.out.println("WELCOME to Address Book Program");
		Addressbook entry = new Addressbook("Naveen", "M", "NVM", "AP", "517581","709****907", "naveennvm4@gmail.com");
		System.out.println("First name: " + entry.FIRST_NAME);
		System.out.println("Last name: " + entry.LAST_NAME);
		System.out.println("City: " + entry.CITY);
		System.out.println("State: " + entry.STATE);
		System.out.println("Pin code: " + entry.ZIP_CODE);
		System.out.println("Phone number: " + entry.PHONE_NO);
		System.out.println("E-Mail: " + entry.EMAIL);
	}
}

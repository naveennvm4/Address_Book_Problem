import java.util.Objects;
import java.util.Scanner;

public class Addressbook{
    public class Entry{
        private final String FIRST_NAME;
        private final String LAST_NAME;
        private final String CITY;
        private final String STATE;
        private final String ZIP_CODE;
        private final String PHONE_NO;
        private final String EMAIL;

        Entry(String firstName, String lastName, String city, String state,
                                    String zip_code, String phone_no, String email){
            this.FIRST_NAME = firstName;
            this.LAST_NAME = lastName;
            this.CITY = city;
            this.STATE = state;
            this.ZIP_CODE = zip_code;
            this.PHONE_NO = phone_no;
            this.EMAIL = email;
        }

        Entry()
        {
            this("","","","","","","");
        }

        public String toString(){
            return "First Name :"+FIRST_NAME+"\nLast Name:"+LAST_NAME+"\nState:"+STATE+"\nCity:"
            		+CITY+"\nZip_code:"+ZIP_CODE+"\nPhone_no:"+PHONE_NO+"\nEmail:"+EMAIL;
        }
    }

    private int entries = 0;
    Entry[] content;
    public void initEntries(int e){
        content = new Entry[e];
        for (int i = 0;i<content.length;i++){
        	//Initializes an array of entries, then loops through to initialize each individual entry
            content[i] = new Entry();
        }
    }
    
    public int getLength(){
        return content.length;
    }
    
    public void addEntry(String firstName, String lastName, String city,
                    String state, String zip_code, String phone_no, String email){
            content[entries] = new Entry(firstName, lastName, city, state, zip_code, phone_no, email);
            entries++;
    }

    public void editEntry(String firstName, String lastName, String city,
                          String state, String zip_code, String phone_no, String email, String name){
        for (int i = 0;i<content.length;i++) {
            if (Objects.equals(content[i].FIRST_NAME, name))
                content[i] = new Entry(firstName, lastName, city, state, zip_code, phone_no, email);
            else
                System.out.println("Person Not found at Entry");
        }
    }

    public void deleteEntry(String name) {
        if (entries>0){
            Entry[] removedArray = new Entry[content.length];
            for (int i = 0, k = 0 ;i<content.length;i++){
                if (Objects.equals(content[i].FIRST_NAME, name)){
                    continue;
                }
                removedArray[k++] = content[i];
            }
            System.arraycopy(removedArray, 0, content, 0, entries);
            entries--;
        }
        else System.out.println("Book is empty");
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Addressbooks do you want to create: ");
        int numOfBook;
        int numOfEntry;

        Addressbook[] book = new Addressbook[0];
        while(true){
            numOfBook = sc.nextInt();
            if (numOfBook>0){
                book = new Addressbook[numOfBook];
                break;
            }
            else System.out.print("You must create at least 1 book");
        }

        for (int i=0;i<book.length;i++){
            book[i] = new Addressbook();
            while(true){
                System.out.print("How many entries in book "+(i+1)+": ");
                numOfEntry = sc.nextInt();
                if (numOfEntry>0) {
                    book[i].initEntries(numOfEntry);
                    break;
                }
                else System.out.println("You must create atleast 1 Entry");
            }
        }

        boolean done = false;
        int selectBook = 0;
        int choice;
        while (!done){
            System.out.println("Book "+(selectBook+1)+" is currently selected");
            for (int i = 0;i<book[selectBook].getLength();i++){
                System.out.println("Entry "+(i+1)+" ");
                System.out.println(book[selectBook].content[i]);
                //Accessing the array of entries INSIDE the array of books/the book
                System.out.println("================================");
            }

            System.out.println("1. Add an entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Remove an entry");
            System.out.println("4. Select another book");
            System.out.println("5. Exit the menu");
            choice = sc.nextInt();
            String firstName, lastName, city, state, zip_code, phone_no, email;
            switch(choice){
            case 1:
                System.out.print("First name: ");
                firstName = sc.next();
                System.out.print("Last name: ");
                lastName = sc.next();
                System.out.print("City: ");
                city = sc.next();
                System.out.print("State: ");
                state = sc.next();
                System.out.print("Zip_code: ");
                zip_code = sc.next();
                System.out.print("Phone_no: ");
                phone_no = sc.next();
                System.out.print("Email: ");
                email = sc.next();
                book[selectBook].addEntry(firstName, lastName, city, state, zip_code, phone_no, email);
                break;
            case 2:
                System.out.print("Enter first name of Person you want to edit: ");
                String name = sc.next();
                System.out.print("First name: ");
                firstName = sc.next();
                System.out.print("Last name: ");
                lastName = sc.next();
                System.out.print("City: ");
                city = sc.next();
                System.out.print("State: ");
                state = sc.next();
                System.out.print("Zip_code: ");
                zip_code = sc.next();
                System.out.print("Phone_no: ");
                phone_no = sc.next();
                System.out.print("Email: ");
                email = sc.next();
                book[selectBook].editEntry(firstName, lastName, city,
                        state, zip_code, phone_no, email, name);
                break;
            case 3:
                System.out.println("Enter first name of Person you want to delete: ");
                name = sc.next();
                book[selectBook].deleteEntry(name);
                break;
            case 4:
                System.out.print("Select which book: ");
                selectBook = sc.nextInt();
                break;
            case 5:
                done = true;
                break;
            default:
                System.out.print("Invalid Choice");
            }
        }
    }
}


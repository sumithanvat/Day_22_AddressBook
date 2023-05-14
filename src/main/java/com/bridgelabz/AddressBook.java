import com.bridgelabz.ContactPerson;

public class AddressBook {
    public void createContact() {

        ContactPerson person = new ContactPerson("Sumit","Hanvat","Ward no 04","Lakhnadon","M.P.","480886","7581800900","skhanvat@gmail.com");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("City: " + person.getCity());
        System.out.println("State: " + person.getState());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Zip Code: " + person.getZip());
        System.out.println("Phone Number: " + person.getPhoneNumber());
        System.out.println("Contact created successfully.....");
    }
}


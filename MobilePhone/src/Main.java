import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("123-456-7890");
        Contact contact1 = Contact.createContact("Alice", "111-222-3333");



        Contact newAliceContact = Contact.createContact("Alice", "000-111-2222");
        System.out.println("Updating Alice: " + myPhone.updateContact(newAliceContact, contact1));
        myPhone.printContacts();



    }
}
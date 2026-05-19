import java.util.ArrayList;
import java.util.Arrays;

public class ContactListTester {
    public static void main(String[] args) {
        Contact contact1 = new Contact("John", "Doe", "123-456-7890");
        Contact contact2 = new Contact("Jane", "Doe", "098-765-4321");
        Contact contact3 = new Contact("John", "Smith", "123-456-7890");
        Contact contact4 = new Contact("John", "Smith", "123-456" + "-7890");
        Contact contact5 = new Contact("John", "Smith", "323-456-7890");

        ContactList list = new ContactList();
        list.add(contact1);
        list.add(contact2);
        list.add(contact3);
        list.add(contact4);
        list.add(contact5);

        list.sortByTelephoneNumber();
    }
}


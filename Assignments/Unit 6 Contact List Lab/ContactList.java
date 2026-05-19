import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<Contact> contactList;

    // constructor
    // to-do: initializes an empty contact list
    public ContactList() {
        this.contactList = new ArrayList<Contact>();
    }

    // methods

    // to-do: findInsertLocation(String name)
    /**
     * returns the location in the contact list where the name should go to keep the list
     * alphabetized
     */
    private int findInsertLocation(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        // You can use a sequential search here. But for a Stretch Challenge, try to do a binary
        // search.
        for (int i = 0; i < contactList.size(); i++) {
            if (contact.toString().compareTo(contactList.get(i).toString()) < 0) {
                return i;
            }
        }
        return contactList.size();
    }

    // to-do: add(String name)
    /**
     * adds a name to the contact list so that the list remains alphabetized, it prints out which
     * name is being added, also the method prevents duplicate names from being added
     */
    public boolean add(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Contact invalid");
        }
        Contact forName = new Contact(name, "", "");
        return add(forName);
    }

    public boolean add(Contact contact) {
        System.out.println("+ Adding " + contact.toString());
        if (contact == null || contact.getTelephoneNumber() == null
                || contact.getFirstName() == null || contact.getLastName() == null) {
            throw new IllegalArgumentException("Contact invalid");
        }
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getTelephoneNumber()
                    .compareTo(contact.getTelephoneNumber()) == 0) {
                return false;
            }
        }
        int index = findInsertLocation(contact);
        contactList.add(index, contact);
        return true;
    }

    // to-do: add(ArrayList<String> names)
    /* this method adds a list of names to the contact list */
    public void add(ArrayList<Contact> contacts) {
        if (contacts == null) {
            throw new IllegalArgumentException("Names cannot be null.");
        }
        for (int i = 0; i < contacts.size(); i++) {
            add(contacts.get(i));
        }
    }

    // to-do: remove(String name)
    /** removes name from the contact list and keeps list alphabetized */
    public boolean remove(Contact contact) {
        System.out.println("- Removing " + contact);
        if (contact == null) {
            throw new IllegalArgumentException("Names cannot be null.");
        }
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).equals(contact)) {
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    // to-do: remove(ArrayList<String> names)
    /* this method removes a list of names from the contact list */
    public void remove(ArrayList<Contact> contacts) {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("- Removing " + contacts.get(i));
            remove(contacts.get(i));
        }
    }

    public void sortByFirstName() {
        ArrayList<Contact> temporaryList = new ArrayList<>();
        while (contactList.size() > 0) {
            Contact smallest = findSmallestContactFirstName();
            contactList.remove(smallest);
            temporaryList.add(smallest);
        }
        contactList = temporaryList;
    }

    public void sortByLastName() {
        ArrayList<Contact> temporaryList = new ArrayList<>();
        while (contactList.size() > 0) {
            Contact smallest = findSmallestContactLastName();
            contactList.remove(smallest);
            temporaryList.add(smallest);
        }
        contactList = temporaryList;
    }

    public Contact findSmallestContactFirstName() {
        Contact firstFirstName = contactList.get(0);
        for (int i = 0; i < contactList.size(); i++) {
            String contactSecondName = contactList.get(i).getFirstName();
            if (firstFirstName.getFirstName().compareTo(contactSecondName) > 0) {
                firstFirstName = contactList.get(i);
            } else if (firstFirstName.getFirstName().compareTo(contactSecondName) == 0) {
                if (compareLastName(firstFirstName, contactList.get(i)) == contactList.get(i)) {
                    firstFirstName = contactList.get(i);
                } else if (firstFirstName.getLastName()
                        .compareTo(contactList.get(i).getLastName()) == 0) {
                    firstFirstName = compareTelephoneNumbers(firstFirstName, contactList.get(i));
                }
            }
        }
        return firstFirstName;
    }

    public Contact compareLastName(Contact a, Contact b) {
        if (a.getLastName().compareTo(b.getLastName()) < 0) {
            return a;
        } else if (a.getLastName().compareTo(b.getLastName()) > 0) {
            return b;
        } else {
            return compareTelephoneNumbers(a, b);
        }
    }

    public Contact compareTelephoneNumbers(Contact a, Contact b) {
        if (a.getTelephoneNumber().compareTo(b.getTelephoneNumber()) < 0) {
            return a;
        } else {
            return b;
        }
    }

    public Contact findSmallestContactLastName() {
        Contact firstLastName = contactList.get(0);
        for (int i = 0; i < contactList.size(); i++) {
            String contactSecondName = contactList.get(i).getLastName();
            if (firstLastName.getLastName().compareTo(contactSecondName) > 0) {
                firstLastName = contactList.get(i);
            } else if (firstLastName.getLastName().compareTo(contactSecondName) == 0) {
                firstLastName = compareTelephoneNumbers(firstLastName, contactList.get(i));
            }
        }
        return firstLastName;
    }

    public void sortByTelephoneNumber() {
        Contact firstTelephoneNumber = contactList.get(0);
        int location = 0;
        for (int i = 0; i < contactList.size(); i++) {
            if (firstTelephoneNumber.getTelephoneNumber()
                    .compareTo(contactList.get(i).getTelephoneNumber()) > 0) {
                Contact temp = firstTelephoneNumber;
                firstTelephoneNumber = contactList.get(i);
                contactList.set(location, firstTelephoneNumber);
                contactList.set(i, temp);
                location++;
            }
        }
    }

    public Contact searchContacts(String telephoneNumber) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getTelephoneNumber().compareTo(telephoneNumber) == 0) {
                return contactList.get(i);
            }
        }
        return null;
    }

    /** returns a String containing all of the words in list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    public Contact get(int index) {
        if (index >= contactList.size() || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return contactList.get(index);
    }

    // to-do: size()
    /** returns the number of names in the contact list */
    public int size() {
        return contactList.size();
    }

    // to-do: clear()
    /** removes all names from the contact list */
    public void clear() {
        System.out.println("Clearing the contact list");
        for (int i = 0; i < contactList.size(); i++) {
            contactList.remove(0);
        }
    }

}

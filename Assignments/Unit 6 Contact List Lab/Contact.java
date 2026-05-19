public class Contact implements Comparable {
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = validateTelephoneNumber(telephoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        if (validateTelephoneNumber(telephoneNumber).equals(telephoneNumber)) {
            this.telephoneNumber = telephoneNumber;
        }
    }

    public int compareTo(Object other) {
        if (other == null) {
            throw new IllegalArgumentException("The object you are comparing to is null.");
        }

        if (other instanceof Contact) {
            return toString().compareTo(other.toString());
        }
        throw new IllegalArgumentException("Object not comparable");
    }

    public String toString() {
        return lastName + " " + firstName + " " + telephoneNumber;
    }

    public String validateTelephoneNumber(String number) {
        if (number.length() == 12 && number.charAt(3) == '-' && number.charAt(7) == '-') {
            return number;
        }
        throw new IllegalArgumentException("Invalid telephone number.");
    }
}

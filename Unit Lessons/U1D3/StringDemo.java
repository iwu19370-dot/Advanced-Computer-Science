public class StringDemo{
    // in the AP, only use these methods from this class
    public static void main(String[] args) {
        // Strings are objects
        String fullName = "Juan Lopez";
        String fullName2 = "Juan Lopez";
        System.out.println(fullName == fullName2);
        fullName2 = "Juan Antonio Lopez";
        String fullName3 = new String("Juan Lopez");

        // fullName3 += ":)";


        // Strings are IMMUTABLE (they can't change!)
        // Any change immediately creates a new string object

        // Dog dog1 = new Dog();
        // Dog dog2 = new Dog();
        System.out.println(fullName == fullName3);
        System.out.println(fullName.equals(fullName3));

        // methods
        // charAt() -> returns the char value at index (starts at 0)
        // "Juan Lopez"
        System.out.println(fullName.charAt(3)); // n

        // indexOf() -> returns the index of a char value
        System.out.println(fullName.indexOf("n")); // 3

        // "Juan Antonio Lopez"
        System.out.println(fullName2.indexOf("n"));

        // subString() -> returns a piece of a string given a starting and ending index

        // "Juan Antonio Lopez"
        int firstSpace = fullName2.indexOf(""); // finds the index of the first space
        String middleLastName = fullName2.substring(firstSpace); // create a substring starting at the first space to the end
        // " Antonio Lopez"
        System.out.println(middleLastName.indexOf("n")); // find index of n (return 2)
        // "Antonio"
        String middleName = fullName.substring(5,13);
        // substring(inclusive, exclusive)
        System.out.println(middleName.indexOf("z")); // -1, this is useful

        // compareTo() -> returns a number depending on the order
        String string1 = "abc";
        String string2 = "abd";

        System.out.println(string1.compareTo(string2));
        // returns the very first non-zero number, this one is c - d
        // if lengths aren't equal, returns the difference of the lengths
        // returns negative if abc is "before" abd
        // returns positive if abc is "after" abd
        // returns 0 if strings are equal
    }
}
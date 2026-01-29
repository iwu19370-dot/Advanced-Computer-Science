// arrays -> objects that represent a list of elements
// the size of an array cannot be changed once initialized (size is immutable)
// if I want to expand the array, I'd have to create an entirely new array and copy the old values
// arrays do not have methods!

// ArrayList class
// expandable list and has methods!
// must import the class before use

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        // Instead of names[1] = "Lopez"
        // arraylists reserve 10 empty spots in your memory
        names.add("Daniel");
        names.add("Matthew");
        names.add("Morgan");
        names.add("Ava");
        names.add("Crystal");
        names.add("Isabelle");
        names.add("Jason");
        names.add("Ryan");
        names.add("Zayra");
        names.add("Boyan");
        names.add("Henry");
        names.add("James");
        names.add("Owen");
        // reserve 15 slots in memory once it goes over 10, expands 1.5 times
        // 10 -> 15 -> 23 -> 35 (rounds up)

        System.out.println(names);
        System.out.println(names.size());

        System.out.println(names.get(4));
        // drawback on arraylists is that we cannot use them with primitive data types!!

        // we can wrap the integer in the Integer wrapper class
        // Integer.parseInt()
        ArrayList<Integer> myFavNumbers = new ArrayList<Integer>();
        myFavNumbers.add(5); // {5}
        myFavNumbers.add(6); // {5, 6}
        myFavNumbers.add(7); // {5, 6, 7}
        myFavNumbers.add(8); // {5, 6, 7, 8}
        myFavNumbers.add(13); // {5, 6, 7, 8, 13}
        myFavNumbers.add(17); // {5, 6, 7, 8, 13, 17}
        myFavNumbers.add(23); // {5, 6, 7, 8, 13, 17, 23}

        myFavNumbers.add(0, 2); // index, value -> {2, 5, 6, 7, 8, 13, 17, 23}
        System.out.println(myFavNumbers.set(1, 3)); // {2, 3, 6, 7, 8, 13, 17, 23}
        // set -> returns the value that was replaced

        System.out.println(myFavNumbers.remove(1)); // {2, 6, 7, 8, 13, 17, 23}
        // removes the index at 1 and returns it
    
        System.out.println(myFavNumbers.get(2));

        myFavNumbers.add(myFavNumbers.set(1, 49));
    }
}
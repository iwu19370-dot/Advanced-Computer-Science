public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); // new cat, not gonna be 2 names
        Cat otherCat = new Cat("Tiger Beast", "Tabby"); // new cat, not gonna be 2 names
        System.out.println(myCat.toString());
        System.out.println(myCat.getName()); // just get name with sout
        System.out.println(myCat.equals(otherCat)); // just equals with sout
        myCat.getIsHungry(); // just is hungry

        String firstName = "Tiger";
        String lastName = "Beast";
        String name = firstName + " " + lastName;
        
        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println(myCat.equals(otherCat));// just equals

    }

}
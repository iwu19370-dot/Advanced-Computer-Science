// A class is a collection of related attributes and behaviors

public class HelloWorld {

    // Main -> an entrypoint for your computer to start running code
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My name is Isabelle.");

        System.out.print("My favorite pizza topping is cheese.");
        System.out.print(" My favorite caffeinated drink is tea.");

        // 8 primitive data types
        int number = 5; // integer
        char letter = 'a'; // character
        boolean isTrue = true; // true or false
        float decimal = 50.0f; // 32 bit decimal
        double bigdecimal = 0.6; // 64 bit decimal number

        // INT ALTERNATIVES (can ignore for this class)
        byte age = 25;
        short population = 3200;
        long biginteger = 10000;

        String myName = "Isabelle"; // String is a CLASS not a primitive data type
        // a collection of PRIMITIVE characters to describe texts

        // pront put the length of the string using the length() method
        System.out.println(myName.length());

        // conditional statements
        // if this happens then that happens
        // condiditons are always BOOLEAN meaning true/false

        // Example 1
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        // Example 2
        boolean isCompSciFun = true;

        if (isCompSciFun == false) {
            System.out.println("Comp Sci sucks");
        } else if (isCompSciFun == true) {
            System.out.println("Comp Sci is fun!");
        }

        // Example 2.1
        if (isCompSciFun) {
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci stresses me out.");
        }

        // Challange: Write a conditional if-else statement where you do something if you ate 5
        // apples vs 10

        // Challenge Complete 1
        int appleCount = 3;
        if (appleCount == 5) {
            System.out.println("You ate 5 apples.");
        }
        if (appleCount == 10) {
            System.out.println("You ate 10 apples!");
        } else {
            System.out.println("You ate " + appleCount + " apples.");
        }

        // Challenge Complete 2
        if (appleCount == 5 || appleCount == 10) {
            System.out.println("You ate " + appleCount + " apples.");
        } else {
            System.out.println("You ate a different amount of apples apples.");
        }

    }


}


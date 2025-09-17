public class CastingDemo {
    public static void main(String[] args) {

        // implicit casting
        // storing smaller data types into larger ones
        // happens automatically

        int smallNumber = 100;
        long bigNumber = smallNumber; // int to long 
        float decimalNumber = bigNumber; // long to float
        double largeDecimal = decimalNumber; // float to double

        // explicit casting
        // we are manually converting a data type, usually to a different data type that may incur data loss
        // may incur data loss

        double pi = 3.14159;
        int engineerPi = (int) pi;
        System.out.println(engineerPi); // truncation - you lost all decimals
        pi = engineerPi;
        System.out.println(pi);

        long population = 300L;
        int limitedPopulation = (int) population;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int letterA = 'a';
        System.out.println(letterA + 3);

        // there is no implicit ot explicit casting between booleans and integers

        // we're not gonna talk about casting object classes
    }
}
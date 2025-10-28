public class Utils{
    public static void main(String[] args) {
        
        // a class that contains a list of the characters to form words
        // it gives string methods that we can use!
        String x = "hello";
        String.valueOf("123"); // converts an integer String to int

        int y = 10; // are primitive and do not have any methods

        // Integer Wrapper
        Integer yWrapper = 10; //the value 10 has methods now!
        yWrapper.toString();
        Integer.parseInt("123"); //  converts strings to integers!

        // Boolean Wrapper
        boolean isFalse = false;
        Boolean isTrue = true;
        isTrue.toString();
        Boolean.parseBoolean("hello");

        // Double Wrapper
        double decimal = 1.1;
        Double decimalWrapper = 1.1;
        System.out.println(Double.parseDouble("13.76"));
    }
}
public class ConditionalChallenge {
    public static void main(String[] args) {

        System.out.println("--- Part 1: Temperature Converter ---");
        int temperature = 27;
        boolean isCold = true;
        if (isCold == true) {
            int temp = temperature - 15;
            System.out.println("The temperature is " + temp + " degrees Celcius.");
        } else {
            int temp = temperature + 10;
            System.out.println("The temperature is " + temp + " degrees Celcius.");
        }

        System.out.println("--- Part 2: Grade Calculator ---");
        int score = 97;
        if (score >= 70) { 
            System.out.println("Passed and your score is " + score + ".");
        } else {
            System.out.println("Failed and your score is " + score + ".");
        }

        System.out.println("--- Part 3: Leap Year Checker ---");
        int temperature2 = 80;
        if (temperature2 > 80) {
            System.out.println("Summer and it is " + temperature2 + " degrees Farenheit.");
        }
        if (60 <= temperature2 && temperature2 <= 80) {
            System.out.println("Spring and it is " + temperature2 + " degrees Farenheit.");
        }
        if (40 <= temperature2 && temperature2 <= 59) {
            System.out.println("Fall and it is " + temperature2 + " degrees Farenheit.");
        }
        if (temperature2 < 40) {
            System.out.println("Winter and it is " + temperature2 + " degrees Farenheit.");
        }

        System.out.println("--- Part 4: Number Classifier ---");
        int number = 9;
        if (number > 0 && number < 100) {
            System.out.println("Positive");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        if (number < 0 && number >= -100) {
            System.out.println("Negative");
        }
        if (number > 100) { 
            System.out.println("Large");
        }
        if (number < -100) {
            System.out.println("Very Negative");
        }
        
    }
}
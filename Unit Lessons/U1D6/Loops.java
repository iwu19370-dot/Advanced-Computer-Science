public class Loops {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        boolean isRunning = true;
        while (isRunning) {
            count++;
            if(count == 100) {
                isRunning = false;
            }
        }

        for (int count2 = 0; count2 < 10; count2++){
            System.out.println(count2);
        }

        // A for-loop is best when you know the exact number of iterations(repetitions)
        // More compact with its syntax

        // A while-loop is best when you DON'T know the exact number of repetitions
        // Requires the initialization to be outside of the loop, and the iterator to be updated inside the loop

        // Dowhile loops (statements first, then while-loop)
        do {
            System.out.println("do this first");
            System.out.println("then check condition");
        } while (isRunning);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("All work and no play makes Jack a dull boy");
            }
        }
        // Keep the maximum level od nested loops to 2!
    }
}
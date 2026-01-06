public class DecompositionSolution {
    public static void run() {
        int[] hours = hoursArray();
        int[] steps = stepsArray();
        int[] activeMinutes = activeMinutesArray();

        // Validator
        if(!lengthValidator(hours, steps, activeMinutes)) {
            System.out.println("Invalid input: arrays must be the same length.");
            return;
        }

        // Total steps
        int totalSteps = sum(steps);
        double average = average(steps);

        // Total Active Minutes
        int totalActiveMinutes = sum(activeMinutes);
        double averageActiveMinutes = average(activeMinutes);
        int activeHalfHourCount = countHalfHours(activeMinutes);

        // Average Daily Report
        double[] daillyAverage = averageDailyReport(steps);
    }

    public static int[] hoursArray() {
        return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    }

    public static int[] stepsArray() {
        return new int[] { 120, 90, 60, 50, 80, 300, 1200, 2200, 2800, 2500, 1800, 900 }; 
    }

    public static int[] activeMinutesArray() {
        return new int[] { 2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15 };
    }

    public static boolean lengthValidator(int[] array1, int[] array2, int[] array3) {
        return array1.length == array2.length && array2.length == array3.length;
    }

    public static int sum(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }
        return sumTotal;
    }

    public static double average(int[] array) {
        return sum(array) / array.length;
    }

    public static int countHalfHours(int[] array) {
        int activeHalfHourCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 30) {
                activeHalfHourCount++;
            }
        }
        return activeHalfHourCount;
    }

    public static int[] subArray(int[] array, int start, int end) {
        int[] resultArray = new int[end-start];
        int resultArrayIndex = 0;
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[resultArrayIndex] = array[i];
            resultArrayIndex++;
        }
        return resultArray;
    }

    public static double[] averageDailyReport(int[] steps) {
        double morningAverage = average(subArray(steps, 0, 3));
        double middayAverage = average(subArray(steps, 4, 7));
        double afternoonAverage = average(subArray(steps, 8, 11));
        double[] dailyReport = {morningAverage, middayAverage, afternoonAverage};
        return dailyReport;
    }

    public String toString() {
        return "=== Daily Steps Report (Demo) ===\nHours recorded: " + sum(hoursArray()) + "\nTotal steps: " + sum(stepsArray()) + "\nAverage steps/hour: " + average(stepsArray()) + "\nTotal active minutes: " + sum(activeMinutesArray()) + "\nAverage active minutes/hour: " + average(activeMinutesArray()) + "\nActive hours (>=30 min): " + sum(hoursArray()) + "\nAverage steps - (Morning(0-3), Midday(4-7),Afternoon(8-11)): " + averageDailyReport(stepsArray());
    }

    // Methods have to have a single purpose
}

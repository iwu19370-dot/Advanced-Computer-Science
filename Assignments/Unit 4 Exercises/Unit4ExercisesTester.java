import java.util.ArrayList;
import java.util.Arrays;

public class Unit4ExercisesTester {
    public static void main(String[] args) {
        int[] testArray = {5, 6, 45, 99, 13, 5, 6};
        int[] testArray1 = {0, 1, 0, 3};
        int[] testArray2 = {5, 45, 98, 0};

        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 1));
        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 2));
        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 3));
        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 7));

        System.out.println(Unit4Exercises.hasThreeConsecutive(testArray));
        System.out.println(Unit4Exercises.hasThreeConsecutive(testArray1));
        System.out.println(Unit4Exercises.hasThreeConsecutive(testArray2));

        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(2, 8)));
        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(-2, 8)));
        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(-8, -2)));
        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(-2, -2)));
        try {
            System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(-2, -8)));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println(Arrays.toString(Unit4Exercises.fizzBuzz(1, 8)));
        System.out.println(Arrays.toString(Unit4Exercises.fizzBuzz(1, 6)));
        System.out.println(Arrays.toString(Unit4Exercises.fizzBuzz(-8, -2)));
        System.out.println(Arrays.toString(Unit4Exercises.fizzBuzz(-2, -2)));
        try {
            System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(-2, -8)));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println(Arrays.toString(Unit4Exercises.moveEvenBeforeOdd(testArray2)));
        System.out.println(Arrays.toString(Unit4Exercises.moveEvenBeforeOdd(testArray)));
        System.out.println(Arrays.toString(Unit4Exercises.moveEvenBeforeOdd(testArray1)));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -2));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-3, -3, 3, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(14, 15, 19));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 13, 19));
        System.out.println(Unit4Exercises.noNegatives(list));
        System.out.println(Unit4Exercises.noNegatives(list1));
        System.out.println(Unit4Exercises.noNegatives(list2));

        System.out.println(Unit4Exercises.excludeTeenNumbers(list2));
        System.out.println(Unit4Exercises.excludeTeenNumbers(list3));

        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList(""));
        System.out.println(Unit4Exercises.appendY(list4));
        System.out.println(Unit4Exercises.appendY(list5));

        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(Unit4Exercises.squarePlus10(list6));
    }
}

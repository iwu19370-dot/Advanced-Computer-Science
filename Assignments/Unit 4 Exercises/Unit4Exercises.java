import java.util.ArrayList;

public class Unit4Exercises {
    // Method 1: matchingEndSequences not done
    public static boolean matchingEndSequences(int[] nums, int n) {
        // to-do: implement the method
        if (n == 0) {
            return true;
        }
        if (n == nums.length) {
            return true;
        }
        if (n > nums.length - 1) {
            throw new IllegalArgumentException("n is out of bounds for the array.");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative.");
        }
        int[] firstHalf = new int[n];
        for (int i = 0; i < n; i++) {
            firstHalf[i] = nums[i];
        }
        int length = 0;
        int[] secondHalf = new int[n];
        for (int i = nums.length - n; i < nums.length; i++) {
            secondHalf[length] = nums[i];
            length++;
        }
        for (int i = 0; i < secondHalf.length; i++) {
            if (firstHalf[i] != secondHalf[i]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        // to-do: implement the method
        if (nums == null) {
            throw new IllegalArgumentException("The array doesn't exist.");
        }
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            }
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        // to-do: implement the method
        if (end < start) {
            throw new IllegalArgumentException("End cannot be smaller that start");
        }
        int anotherStart = start;
        int[] array = new int[end - start];
        for (int i = 0; i < array.length; i++) {
            array[i] = anotherStart;
            anotherStart++;
        }
        return array;
    }

    // Method 4: fizzBuzz not done
    public static String[] fizzBuzz(int start, int end) {
        // to-do: implement the method
        if (end < start) {
            throw new IllegalArgumentException("End cannot be smaller that start");
        }
        int anotherStart = start;
        String[] array = new String[end - start];
        for (int i = 0; i < array.length; i++) {
            if (anotherStart % 15 == 0) {
                array[i] = "FizzBuzz";
            } else if (anotherStart % 3 == 0) {
                array[i] = "Fizz";
            } else if (anotherStart % 5 == 0) {
                array[i] = "Buzz";
            } else {
                array[i] = "" + anotherStart;
            }
            anotherStart++;
        }
        return array;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // to-do: implement the method
        if (nums == null) {
            throw new IllegalArgumentException("Can't be null.");
        }
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            }
        }
        int[] arrayWithEvenFirst = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = evenCount;
        for (int i = 0; i < arrayWithEvenFirst.length; i++) {
            if (nums[i] % 2 == 0) {
                arrayWithEvenFirst[evenIndex] = nums[i];
                evenIndex++;
            } else {
                arrayWithEvenFirst[oddIndex] = nums[i];
                oddIndex++;
            }
        }
        return arrayWithEvenFirst;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= 0) {
                list.add(nums.get(i));
            }
        }
        return list;
    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 13 || nums.get(i) > 19) {
                list.add(nums.get(i));
            }
        }
        return list;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i) != "y") {
                list.add(strs.get(i) + "y");
            }
        }
        return list;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}

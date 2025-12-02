public class ShortCircuitEvaluation {
    public static void main(String[] args) {
        
        String [] names = {"Henry", "Crystal", "Boyan", "Daniel", "Owen", "null", "Ava", "Morgan"};

        // count how many students are in the list

        int count = 0;
        for (int i = 0; i < names.length - 1; i++) {
            if (!(names[i] == null && names[i].length() == 0)) {
                count = count + 1;
            }
        }
        System.out.println(count);

        // short circuit evalutaion

        // T && T -> true
        // F && ?? -> false (skips second condition)
        // T || ?? -> true (skips second condition)
        // F || T -> true
    }
}
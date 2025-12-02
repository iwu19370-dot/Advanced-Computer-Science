public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    // to-do: implement getters

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    // to-do: implement getTestScore

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // inherited methods
    // to-do: implement toString

    public String toString() {
        String record = "";
        for (int i = 0; i < scores.length - 1; i++) {
            record = record + scores[i] + ", ";
        }
        return "" + name + "'s scores: [" + record + "" + scores[scores.length - 1] + "]";
    }

    public boolean equals(StudentRecord other) {
        if (name.equals(other.name) == false) {
            return false;
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != other.scores[i]) {
                return false;
            }
        }
        return true;
    }

    public int getTestScore(int testNumber) {
        if (testNumber < 0 || testNumber > scores.length - 1) {
            return -1;
        }
        return scores[testNumber];
    }

    // methods

    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        double total = 0;
        if (first >= 0 && first <= last && last < scores.length) {
            for (int i = first; i <= last; i++) {
                total = total + scores[i];   
            }
            return total / (last + 1 - first);
        } else {
            return 0.0;
        }
    }

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        boolean improved = true;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] <= scores[i + 1] 
                && scores[scores.length - 2] < scores[scores.length - 1]) {
                improved = true;
            } else {
                return false;
            }
        }
        return improved;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        if (hasImproved() == true) {
            if (scores.length % 2 == 1) {
                System.out.println(scores.length / 2);
                return getAverage(scores.length / 2, scores.length - 1);
            } else {
                System.out.println(scores.length / 2);
                System.out.println(scores.length - 1);
                return getAverage(scores.length / 2, scores.length - 1);
            }
        } else {
            return getAverage(0, scores.length - 1);
        }
    }

}
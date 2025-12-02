public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = "Compouter Science";
        this.enrolledStudents = new StudentRecord[maxEnrollment];
    }

    // getters
    // to-do: implement getters

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    // setters
    // to-do: implement setters
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // inherited methods

    // to-do: implement toString

    public String toString() {
        String numberAndScores = "";
        for (int i = 0; i < enrolledStudents.length; i++) {
            numberAndScores = numberAndScores + (i + 1) + ".) " 
                + enrolledStudents[i].toString() + "\n"; 
        }
        return "== " + courseName + " ==\n" + numberAndScores;
    }


    // methods

    /*
     * Iterates through the enrolledStudents array and returns the name of the
     * student with the best final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent
    public String findBestStudent() {
        double best = enrolledStudents[0].getFinalAverage();
        String studentName = enrolledStudents[0].getName();
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() >= best) {
                best = enrolledStudents[i].getFinalAverage();
                studentName = enrolledStudents[i].getName();
            }
        }
        return studentName;
    }

    /*
     * Iterates through the enrolledStudents array and returns the average of the
     * specified test number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage
    public double calculateTestAverage(int test) {
        double testScore = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            testScore = testScore + enrolledStudents[i].getTestScore(test);
        }
        return testScore / enrolledStudents.length;
    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == student) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count = count + 1;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        if (sizeIncrease <= 0) {
            return;
        }
        StudentRecord[] newOne = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newOne[i] = enrolledStudents[i];
        }
        setEnrolledStudents(newOne);
    }
}
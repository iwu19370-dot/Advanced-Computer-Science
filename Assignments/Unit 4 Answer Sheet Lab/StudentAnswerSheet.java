import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.name = name;
        this.answers = answers;
        this.testScore = 0.0;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null || answers == null || key.size() <= 0 || key.size() != answers.size()) {
            throw new IllegalArgumentException("Can't do that.");
        }
        double total = 0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i).equals("?")) {
                total = total + 0;
            } else if (answers.get(i).equals(key.get(i))) {
                total = total + 1;
            } else {
                total = total - 0.25;
            }
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

}
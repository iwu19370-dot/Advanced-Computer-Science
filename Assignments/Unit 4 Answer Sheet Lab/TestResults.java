import java.util.ArrayList;

public class TestResults {
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null) {
            throw new IllegalArgumentException("Can't be null.");
        }
        if (submissions == null) {
            throw new IllegalArgumentException("Can't be null.");
        }
        this.answerKey = key;
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        if (submissions == null) {
            throw new IllegalArgumentException("Can't be null.");
        }
        for (int i = 0; i < submissions.size(); i++) {
            if (submissions.get(i).getAnswers().size() != answerKey.size()) {
                throw new IllegalArgumentException("They have different lengths.");
            } 
            submissions.get(i).setTestScore(submissions.get(i).getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions == null || submissions.size() == 0) {
            return "";
        }
        String name = submissions.get(0).getName();
        double highestScore = submissions.get(0).getTestScore();
        for (int i = 1; i < submissions.size(); i++) {
            if (submissions.get(i).getTestScore() > highestScore) {
                highestScore = submissions.get(i).getTestScore();
                name = submissions.get(i).getName();
            }
        }
        return name;
    }

    public ArrayList<String> answerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    
}

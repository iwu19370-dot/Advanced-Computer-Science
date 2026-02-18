import java.util.ArrayList;

import java.util.List;


public class AnswerSheetTester {
    public static void main(String[] args) {
        ArrayList<String> answers = new ArrayList<>(List.of("A", "B", "C", "B", "D"));
        ArrayList<String> key = new ArrayList<>(List.of("A", "B", "C", "?", "A"));
        ArrayList<String> key1 = new ArrayList<>(List.of("B", "A", "A", "A", "A"));
        ArrayList<String> key2 = new ArrayList<>(List.of(""));
        StudentAnswerSheet student = new StudentAnswerSheet("John", answers);
        System.out.println(student.getGrade(key));
        System.out.println(student.getGrade(key1));
        System.out.println(student.getGrade(key2));
        
        
    }
}

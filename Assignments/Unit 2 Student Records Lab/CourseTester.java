public class CourseTester {
    public static void main(String[] args) {
        int[] score = {30, 30, 30, 30, 30};
        int[] score1 = {30, 30, 30, 50, 60};
        int[] score2 = {70, 75, 80, 85};
        StudentRecord record4 = new StudentRecord("i", score2);
        System.out.println(record4.getFinalAverage());
        StudentRecord record = new StudentRecord("Jack", score);
        StudentRecord record2 = new StudentRecord("Lily", score1);
        StudentRecord[] record3 = {record, record2};
        Course computerScience = new Course("Computer Science", record3);
        System.out.println(computerScience.toString());
        System.out.println(computerScience.findBestStudent());
        System.out.println(computerScience.calculateTestAverage(3));
        System.out.println(record.toString());
        System.out.println(record.equals(record2));
        System.out.println(record.getAverage(0, 4));
        System.out.println(record.hasImproved());
        System.out.println(record.getFinalAverage());
    }
}
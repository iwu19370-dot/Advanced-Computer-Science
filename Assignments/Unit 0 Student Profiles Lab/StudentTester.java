public class StudentTester {
    public static void main(String[] args) {
        Student soph = new Student("Isabelle", 10);
        Student junior = new Student("Sal", 10);
        System.out.println(junior.equals(soph));
        System.out.println(soph.toString());
    }

}

public class Student implements Comparable{
    private int id;
    private String name;
    private String alphaId;

    public Student(String name, int id, String alphaId) {
        this.name = name;
        this.id = id;
        this.alphaId = alphaId;
    }

    public int compareTo(Object other) {
        if(other instanceof Student) {
            Student otherStudent = (Student) other;
            return alphaId.compareTo(otherStudent.alphaId);
        }
        return -1000;
    }

    public int getId() {
        return id;
    }
}
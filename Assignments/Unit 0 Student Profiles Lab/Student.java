public class Student {
    private String name;
    private String id;
    private int grade;

    

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public String toString() {
        return "" + name + " is a " + grade + "th grade student. Their id is " + id + ".";
    }


    public String generateId() {
        return (int) (Math.random() * 10000000 ) + "";
    }
    
    public boolean equals(Student other) {
        return name.equals(other.name) && id.equals(other.id) && this.grade == other.grade;
    }
}
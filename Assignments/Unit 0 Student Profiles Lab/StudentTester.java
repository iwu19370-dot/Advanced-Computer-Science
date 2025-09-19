public class StudentTester {
    public static void main(String[] args) {
        Student isa = new Student("Isabelle");
        // this is a new student names Isabelle.
        System.out.println(isa.toString());
        // here it should be Isabelle, random id, and grade 10
        isa.setGrade(11);
        // changed the grade to 11
        System.out.println(isa.toString());
        // now everything should be the same except for the grade

        Student sal = new Student("Sal");
        // this is a new student names Sal.
        System.out.println(sal.toString());
        // here it should be Sal, random id, and grade 10
        sal.setGrade(11);
        // changed the grade to 11
        System.out.println(sal.toString());
        // now everything should be the same except for the grade

        System.out.println(isa.equals(sal));

        Student shir = new Student("Shirley", 11);
        // this is a new student names Shirley.
        System.out.println(shir.toString());
        // here it should be Shirley, random id, and grade 11
        sal.setGrade(12);
        // changed the grade to 12
        System.out.println(shir.toString());
        // now everything should be the same except for the grade

        Student lola = new Student("Lola, 11");
        // this is a new student names Lola.
        System.out.println(lola.toString());
        // here it should be Lola, random id, and grade 11
        lola.setGrade(12);
        // changed the grade to 12
        System.out.println(lola.toString());
        // now everything should be the same except for the grade

        System.out.println(shir.equals(lola));
    }
}

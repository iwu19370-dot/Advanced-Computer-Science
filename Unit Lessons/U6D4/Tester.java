public class Tester {
    public static void main(String[] args) {
        Student sarah = new Student("Sarah", 1001, "ABC1");
        Student john = new Student("John", 1002, "DEF2");
        Student jennifer = new Student("Jennifer", 1003, "FBC3");

        System.out.println(john.compareTo(jennifer));
        System.out.println(john.compareTo(sarah));
        System.out.println(john.compareTo(john));
    }
}    
    
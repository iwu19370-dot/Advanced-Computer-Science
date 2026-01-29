public class UniversalTester {
    public static void main(String[] args) {
        Assignment assignment = new Assignment("CS", "All my coding and test info");
        Student i = new Student("i", "123wy", "i123@gmail.com");
        try {
            i.changeName("p@");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            i.changeName("i");
            Student i1 = new Student("i", "123wy", "i123@gmail.com");
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
        try {
            Student i1 = new Student("b", "123", "i123@gmail.com");
            i1.resetPassword();
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
        try {
            Student i2 = new Student("i", "", "i123@gmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            Student i2 = new Student(null, "asdafadv", "i123@gmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            new Assignment(null, "sdafovjd");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            new Assignment("", "sdafovjd");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            new Assignment("Title", null);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            new Assignment("title", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            new Assignment("title", "a".repeat(200));
        } catch (Exception e) {
            System.out.println(e);
        }
        Hub hub = new Hub();
        try {
            hub.registerStudent("a", "password", "asgmail");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            hub.loginStudent("aascsdva", "password");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            hub.registerStudent("a", "password", "as@gmail.com");
            hub.loginStudent("a", "afgafb");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            hub.registerStudent("a", "password", "as@gmail.com");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ForEachDemo {
    public static void main(String[] arga) {

        // for each loops do not work when modifying immutable data tyoes like Strings or primitive data types like integers and booleans.
        
        int[] x = {1, 2, 3, 4, 5};

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        // "for each number in the list x"
        for (int number : x) {
            System.out.println(number);
        }

        String[] names = {"Beverly", "Levi", "Ava", "Boyan"};
        for (String name : names) {
            System.out.println("hello, " + name);
            name = "hello, " + name;
        }
        for (String string : names) {
            System.out.println(names);
        }
    }
}
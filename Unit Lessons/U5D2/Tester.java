import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.toString());

        Rottweiler rottweiler = new Rottweiler();
        System.out.println(rottweiler.toString());

        Shitzu shitzu = new Shitzu();

        ArrayList<Dog> list = new ArrayList<>();
        list.add(rottweiler);
        list.add(shitzu);
        list.get(1).shitzuThings(); // can't access shitzuThings because Dog class doesn't include shitzu specific methods, but we put shitzu as a dog.
    }
}

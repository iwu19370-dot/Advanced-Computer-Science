public class CarTester {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "  Isabelle Wu  ", -1);
        System.out.println(car.toString());
        Car car1 = new Car();
        System.out.println(car1.toString());
        car1 = car;
        System.out.println(car.equals(car1));
    }
}
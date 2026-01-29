public class StaticVariableDemo {
    public static void main(String[] args) {
        Jigglypuff jigglyOriginal = new Jigglypuff();
        System.out.println(Jigglypuff.getType());

        Jigglypuff.setTypes("Fairy");
        for (int i = 0; i < 100; i++) {
            Jigglypuff jiggly = new Jigglypuff();
            System.out.println(jiggly.getType());
        }


    }
}

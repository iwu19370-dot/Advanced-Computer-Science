public class DogTester {
    public static void main(String[] args) {
        // doesn't change the dog Id when I set it to a different number
        Dog one = new Dog("Milk", "Lily", 1, 798);
        System.out.println(one.toString());
        one.setAge(2);
        one.setDogId(799);
        System.out.println(one.toString());
        System.out.println(one.getDogChar());
        System.out.println(one.getDogTag());
        PawesomeUtils.pickup(one, "Lily");
        PawesomeUtils.checkIn(one, "Lily");
        System.out.println(one.toString());
        PawesomeUtils.validateDogId(one.getDogId());
        PawesomeUtils.convertAgeToHumanAge(one);
        System.out.println(PawesomeUtils.validateDogTag(one));

        Dog two = new Dog();
        System.out.println(two.toString());
        two.setAge(3);
        two.setDogId(439);
        System.out.println(two.toString());
        System.out.println(two.getDogChar());
        System.out.println(two.getDogTag());
        PawesomeUtils.validateDogId(two.getDogId());
        two.setDogId(2);
        PawesomeUtils.validateDogId(two.getDogId());

        Dog three = new Dog("Cake", "Bill", 4, 817);
        System.out.println(three.toString());
        three.setAge(5);
        three.setDogId(818);
        System.out.println(three.toString());
        System.out.println(three.getDogChar());
        System.out.println(three.getDogTag());
        PawesomeUtils.validateDogId(three.getDogId());

        Dog four = new Dog();
        four.setAge(3);
        four.setDogId(439);

        System.out.println(two.equals(four));
        System.out.println(one.equals(three));

        four.setStillInFacility(false);
        System.out.println(four.toString());

        System.out.println(PawesomeUtils.validateDogId(1));
        System.out.println(PawesomeUtils.validateDogId(1000));
        System.out.println(PawesomeUtils.validateDogId(105));

        System.out.println(PawesomeUtils.convertAgeToDogYears(30));

        Dog five = new Dog("Chocolate", "Cindy", 1, 6);
        System.out.println(PawesomeUtils.validateDogTag(five));
    }

}

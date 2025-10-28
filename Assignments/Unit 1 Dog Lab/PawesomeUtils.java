public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        return (char) ('F'
                + ((dogId % 10) + (((int) (dogId / 10)) % 10) + (((int) (dogId / 10) / 10)) % 10)
                        % 10);
    }

    public static void pickup(Dog dog, String personName) {
        if (personName == dog.getOwnerName()) {
            dog.setStillInFacility(false);
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog) == true) {
            dog.setStillInFacility(true);
            personName = dog.getOwnerName();
            System.out.println("The dog is checked in");
        } else {
            System.out.println("The dog is denied entry");
        }
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return ("" + dogId) + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (100 <= dogId && dogId <= 999) {
            return dogId;
        } else {
            return (int) ((Math.random() * 900) + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId1 = validateDogId(dog.getDogId());
        char dogChar1 = generateDogChar(dogId1);
        String newDogTag = generateDogTag(dogId1, dogChar1);
        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } 
        if (dog.getAge() == 2) {
            return 24;
        } else {
            return 24 + (dog.getAge() - 2) * 5;
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } 
        if (humanYears > 15 && humanYears <= 24) {
            return 2;
        } else {
            return (humanYears - 24) / 5 + 2;
        }
    }

}

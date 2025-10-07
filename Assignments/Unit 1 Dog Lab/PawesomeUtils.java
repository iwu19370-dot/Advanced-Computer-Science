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
        dog.setStillInFacility(true);
        personName = dog.getOwnerName();
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return ("" + dogId) + dogChar;
    }

    public static void validateDogId(int dogId) {
        if(100 <= dogId && dogId <= 999) {
            return;
        } else {
            dogId = (int) ((Math.random() + 100) * 10);
        }
    }

    public static void validateDogTag(Dog dog) {
        if(validateDogId(dogId) == dog.getDogId());
        dog.getDogChar();
    }

}

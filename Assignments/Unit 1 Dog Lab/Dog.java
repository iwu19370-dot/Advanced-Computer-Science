public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = generateDogChar(dogId);
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Cookie";
        this.ownerName = "Owner";
        this.age = 2;
        this.dogId = 438;
        this.dogChar = generateDogChar(dogId);
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public int getDogId() {
        return dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public static char generateDogChar(int dogId) {
        return (char) ('F'
                + ((dogId % 10) + (((int) (dogId / 10)) % 10) + (((int) (dogId / 10) / 10)) % 10)
                        % 10);
    }

    public String getDogTag() {
        return dogTag;
    }

    public String generateDogTag() {
        return ("" + dogId) + dogChar;
    }


    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = generateDogChar(dogId);
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        String output = "" + name + " is a good dog. They are " + age
                + " years old and belong to " + ownerName + ".";
        if (stillInFacility == true) {
            output += "They are currently in our faculty.";
        } else {
            output += "They are not currently in our faculty.";
        }
        output += "For employee use only: DogTag is " + dogTag + ".";
        if (stillInFacility == true) {
            return output;
        } else {
            return output + "" + name + " has been picked up by their owner " + ownerName + ".";
        }
    }

    public boolean equals(Dog other) {
        return name.equals(other.name) && ownerName.equals(other.ownerName) && age == other.age
                && dogId == other.dogId && dogChar == other.dogChar && dogTag.equals(other.dogTag)
                && stillInFacility == other.stillInFacility;
    }

    public void pickup(Dog dog, String personName) {
        if (personName == ownerName) {
            stillInFacility = false;
        }
    }

    public void checkIn(Dog dog, String personName) {
        stillInFacility = true;
        personName = ownerName;
    }

}

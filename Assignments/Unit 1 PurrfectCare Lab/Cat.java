public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.catId = PurrfectUtils.validateCatId(catId);
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public Cat() {
        this.name = "Cat";
        this.ownerName = "Owner";
        this.moodLevel = 5;
        this.catId = "9994";
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        return getCatId() + getCatChar();
    }

    public String toString() {
        String n = getName().toUpperCase();
        String h = PurrfectUtils.determineCatMood(this);
        String j = "" + getName() + "";
        String l = "" + generateCatTag() + "";
        return "== ABOUT " + n + " ==\n" + j + " is a cat.\nTheir tag is " + l + ".\n" + h;
    }

    public boolean equals(Cat other) {
        boolean a = generateCatTag().equals(other.generateCatTag());
        boolean b = name.equals(other.name);
        boolean c = ownerName.equals(other.ownerName);
        boolean d = moodLevel == other.moodLevel;
        boolean e = isHungry == other.isHungry;
        return a && b && c && d && e;
    }
}

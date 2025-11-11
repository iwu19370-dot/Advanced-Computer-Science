public class Car {
    private String model;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsOilChange;

    public Car(String model, String ownerName, int cleanlinessLevel) {
        this.model = model;
        this.ownerName = AutoUtils.fixName(ownerName);
        this.username = AutoUtils.generateUsername(ownerName);
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsOilChange = false;
    }

    public Car() {
        this.model = "Tesla";
        this.ownerName = "Owner Name";
        this.username = AutoUtils.generateUsername(ownerName);
        this.cleanlinessLevel = 7;
        this.needsOilChange = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }
    
    public void setOwnerName(String ownerName) {
        ownerName = AutoUtils.fixName(ownerName);
        this.ownerName = ownerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    public String toString() {
        return "== ABOUT CAR ==\nModel: " + model + "\nOwner: " + ownerName + "\nUsername: " + username + "\nCleanliness Level: " + cleanlinessLevel + "\nDoes car need oil change? " + needsOilChange + "";
    }

    public boolean equals(Car other) {
        return model.equals(other.model) && ownerName.equals(other.ownerName) && username.equals(other.username) && cleanlinessLevel == other.cleanlinessLevel && needsOilChange == other.needsOilChange;
    }
}
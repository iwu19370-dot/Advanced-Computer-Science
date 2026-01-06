public class BobaShopMember {
    private String name;
    private boolean[] loyaltyCredits;

    public BobaShopMember(String name) {
        this.name = name;
        boolean[] setNumber = new boolean[10];
        this.loyaltyCredits = setNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }
    
    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int countOfTrue = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                countOfTrue++;
            }
        }
        return countOfTrue;
    }

    public String determineMembershipStatus() {
        // int countOfTrue = 0;
        // for (int i = 0; i < loyaltyCredits.length; i++) {
        //     if (loyaltyCredits[i] == true) {
        //         countOfTrue++;
        //     }
        // }
        if (countLoyaltyCredits() >= 6) {
            return "Gold Member";
        }
        if (countLoyaltyCredits() >= 3 && countLoyaltyCredits() <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String loyaltyHistory = "";
        int visitedTimes = countLoyaltyCredits();
        for (int i = 0; i < countLoyaltyCredits(); i++) {
            loyaltyHistory = loyaltyHistory + "X" + ", ";
        }
        for (int i = countLoyaltyCredits(); i < loyaltyCredits.length - 1; i++) {
            loyaltyHistory = loyaltyHistory + "-" + ", ";
        }
        return "Loyalty History: [" + loyaltyHistory + "-]";
    }

    public String toString() {
        return name + "(" + determineMembershipStatus() + "), " + loyaltyHistory();
    }

    public boolean equals(BobaShopMember other) {
        return name.equals(other.name) && loyaltyCredits.equals(other.loyaltyCredits);
    }
}

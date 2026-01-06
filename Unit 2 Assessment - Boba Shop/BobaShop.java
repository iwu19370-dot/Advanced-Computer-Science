public class BobaShop {
    private String shopName;
    private BobaShopMember[] registeredMembers;

    public BobaShop(String shopName, BobaShopMember[] registeredMembers) {
        this.shopName = shopName;
        this.registeredMembers = registeredMembers;
    }

    public BobaShop(String shopName, int initialCapacity) {
        this.shopName = shopName;
        BobaShopMember[] numberOfMembersInitially = new BobaShopMember[initialCapacity];
        this.registeredMembers = numberOfMembersInitially;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BobaShopMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        BobaShopMember[] doubleCapacity = new BobaShopMember[registeredMembers.length 
            + registeredMembers.length];
        for (int i = 0; i < registeredMembers.length; i++) {
            doubleCapacity[i] = registeredMembers[i];
        }
        setRegisteredMembers(doubleCapacity);
    }

    public void registerMember(BobaShopMember member) {
        // if (isFull() == false) {
        //     for (int i = 0; i < registeredMembers.length; i++) {
        //         if (registeredMembers[i] == null) {
        //             registeredMembers[i] = member;
        //         }
        //     }
        // } else {
        //     BobaShopMember[] addNewMember = new BobaShopMember[registeredMembers.length];
        //     for (int i = 0; i < registeredMembers.length; i++) {
        //         addNewMember[i] = registeredMembers[i];
        //     }
        //     setRegisteredMembers(addNewMember);
        //     registeredMembers[registeredMembers.length - 1] = member;
        // }
    }

    public String toString() {
        String newToString = "== " + shopName + " Members ==\n";
        for (int i = 0; i < registeredMembers.length; i++) {
            newToString = newToString + i + ".)" + registeredMembers[i] + toString();
        }
        return newToString;
    }

    public boolean deleteMember(BobaShopMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == member) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }
}
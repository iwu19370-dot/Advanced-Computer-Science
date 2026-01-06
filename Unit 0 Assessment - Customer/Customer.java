public class Customer {
    private String name;
    private String address;
    private int rewardPoints;

    public Customer(String name, String address, int rewardPoints) {
        this.name = name;
        this.address = address;
        this.rewardPoints = rewardPoints;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setAddress(String address1) {
        address = address1;
    }

    public void setRewardPoints(int points) {
        rewardPoints = points;
    }

    public String toString() {
        return "Customer Name: " + name + ", Address: " + address + ", Reward Points: " + rewardPoints + "";
    }

    public boolean equals(Customer other) {
        return rewardPoints == other.rewardPoints && name.equals(other.name) && address.equals(other.address);
    }

    public void boostPoints(double percentage) {
        rewardPoints += (int) (percentage / 100 * rewardPoints);
    }
}

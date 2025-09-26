public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;


    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers1) {
        numberOfLoanOfficers = numberOfLoanOfficers1;
    }

    public void setNumberOfTellers(int numberOfTellers1) {
        numberOfTellers = numberOfTellers1;
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        return "This bank has" 
            + " " + numberOfLoanOfficers + " loan officers and " + numberOfTellers + " tellers";
    }

    public boolean equals(Bank other) {
        boolean areLoanOfficersequal = numberOfLoanOfficers == other.numberOfLoanOfficers;
        boolean areTellersequal = numberOfTellers == other.numberOfTellers;
        return areLoanOfficersequal && areTellersequal;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer == true) {
            numberOfLoanOfficers = numberOfLoanOfficers + numberToHire;
        } else {
            numberOfTellers = numberOfTellers + numberToHire;
        }
    }
}
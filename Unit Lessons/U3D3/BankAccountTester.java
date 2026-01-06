public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        try{
            bank.withdraw(888);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try{
            bank.withdraw(-69);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

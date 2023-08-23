package CT1;

public class CheckingAccount extends BankAccount{
	
	
    private double interestRate;
    
    public CheckingAccount(String firstName, String lastName, int accountID, double balance, double interestRate) {
        super(firstName, lastName, accountID, balance);
        this.interestRate = interestRate;
    }
    
    
    public void processWithdrawal(double amount) {
        if (amount > this.getBalance()) {
            System.out.println("A $30 overdraft fee has been charged due to insufficient balance");
            this.withdrawal(30);
            this.withdrawal(amount);
        } else {
            this.withdrawal(amount);
        }
    }
    
    
    public void displayAccount() {
        System.out.println("Checking Account Details:");
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Account ID: " + this.getAccountID());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
    
    
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}

package CT1;

public class Main {

	public static void main(String[] args) {
		
		CheckingAccount ckAc = new CheckingAccount("Md", "Emran", 201001, 2000.0, 0.05);
	    
	    System.out.println("Account Summary: ");
	    System.out.println("First Name: " + ckAc.getFirstName());
	    System.out.println("Last Name: " + ckAc.getLastName());
	    System.out.println("Account ID: " + ckAc.getAccountID());
	    System.out.println("Balance: $" + ckAc.getBalance());
	    System.out.println("Interest Rate: " + ckAc.getInterestRate());
	    
	    System.out.println("\nMaking a deposit of $300...");
	    ckAc.deposit(300);
	    System.out.println("Balance: $" + ckAc.getBalance());
	    
	    System.out.println("\nMaking a withdrawal of $2600...");
	    ckAc.processWithdrawal(2600);
	    System.out.println("Balance: $" + ckAc.getBalance());
	    
	    System.out.println("\nDisplaying account information...");
	    ckAc.displayAccount();
		
		
	}

}

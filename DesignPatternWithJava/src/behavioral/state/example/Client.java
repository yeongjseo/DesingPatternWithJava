package behavioral.state.example;

public class Client {
    public static void main(String[] args) {
    	Account account = new Account("account1");
    	account.deposit(500.00);
    	account.deposit(300.00);
    	account.deposit(550.00);
    	account.payInterest();
    	account.withdraw(2000.00);
    	account.withdraw(1100.00);
    	
    }
}

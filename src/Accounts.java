import java.util.Scanner;

public class Accounts {
	int balance; 
	int previousTransaction; 
	String customerName;
	String customerID;
	
	
	Accounts(String custName, String custID){
		customerName = custName;
		customerID =   custID;
		
	}
	
	
	public void deposit(int amount) {
		if(amount > 0) {
			balance = balance + amount; 
			previousTransaction = amount; 
			System.out.println("You deopsited: $" + amount);
			System.out.println("Your current balance: $" + balance);
		}
	}
	
	
	public void withdraw(int amount) {
		if(amount != 0 ) {
			balance = balance - amount; 
			previousTransaction = -amount; 
			System.out.println("You withdrawed: $" + amount);
			System.out.println("Your current balance: $" + balance);
			
		}
	}
	
	public void getPreviousTranscation() {
		if(previousTransaction > 0) {
			System.out.println(" Money Deposited: " + previousTransaction);
		}else if(previousTransaction < 0 ) {
			System.out.println(" Money Withdrawed: " + previousTransaction);
		}else {
			System.out.println("No transaction occurred");
		}
		
	}
	public void calculateInterest(int years) {
		double interestRate = 0.0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate));
		System.out.println("After " + years + "years, your balance will be: " + newBalance);
		
	}
	
	public void displayMenu() {
		char option; 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("Please select from one of the options below");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdrawal");
		System.out.println("D. View previous Transaction");
		System.out.println("E. Calculate Interest");
		System.out.println("F. Exit");
		
		
		do {
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option){
			case 'A': 
				System.out.println("========================");
				System.out.println("Balance = $" + balance);
				System.out.println("========================");
				System.out.println();
				break; 
				
			case 'B':
				System.out.println("Enter the amount you want to deopist ");
				int amount = scanner.nextInt(); 
				deposit(amount); 
				System.out.println();
				break; 
			
			case 'C': 
				System.out.println("Enter the amount you want to withdraw ");
				int amount1 = scanner.nextInt();
				withdraw(amount1); 
				System.out.println();
				break; 
				
			case 'D' : 
				System.out.println("========================");
				getPreviousTranscation();
				System.out.println("========================");
				System.out.println();
				break; 
				
			
			case 'E': 
				System.out.println("========================"); 
				int years = scanner.nextInt(); 
				calculateInterest(years); 
				System.out.println("========================");
				break; 
				
				
			case 'F' : 
				System.out.println("========================");
				break; 
				
			default: 
				System.out.println("Error: Invalid option. Please enter one of these options: A,B,C,D,E,F");
				break; 
			}
			
		}while(option != 'F'); 
			System.out.println("Thank you for chosing us, Have a good day :)");
			
		
		
	}
	
}
	
	


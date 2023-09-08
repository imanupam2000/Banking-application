/**import java.util.Scanner;

public class Account
{
	//Class variables
	int balance;
	int previousTransaction;
	String costumerName;
	String costumerId;
	//int newBlance;
	
	//Class constructor
	Account(String cname, String cid){
		costumerName = cname;
		costumerId = cid;
	}
	
	//Function for depositing money
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	//Function for Withdrawing money 
	void withdraw(int amount) {
		if (amount !=0) {
			balance = balance - amount;
			previousTransaction = -amount; 	
		}
		  }
	
	//Function showing the previous transaction  
	void getPreviousTransaction() {
		if (previousTransaction > 0 ) {
		} else if(previousTransaction < 0) {
			System.out.println("Deposited: " + Math.abs(previousTransaction));
		}else{
			System.out.println("No Transaction occourd");
		}
	}
    //Function calculating interest of current funds after a number of years
	void calculateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The crrent intrest Rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + "years, your balance will be: " + newBlance);
		
		
	}
	
	//Function showing the main menu
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(Systeem.in);
		System.out.println("Welcome, " + custoerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println("");
		System.out.println("What would you like to do?");
		System.out.println("");
		System.out.println("A. CHECK BALANCE");
		System.out.println("B. MAKE A DEPOSIT");
		System.out.println("C. MAKE A WITHDRAWAL");
		System.out.println("D VIEW PREVIOUS TRANSACTION");
		System.out.println("E. CALCULATE INTREST");
		System.out.println("F. EXIT ");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			switch(option) {
			//Case 'A' allows the user to check their account balance
			case 'A':
				System.out.println("==============================");
				System.out.println("Balance = Rs" + balance);
				System.out.println("==============================");
				System.out.println();
				break;
			//Case 'B' allows the user to deposit money into their account using	
			case 'B':	
				System.out.println("Enter an amount to deposit: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
				//Case 'C' allows the user to withdraw money from their account using	
			case 'C':	
				System.out.println("Enter an amount to Withdraw: ");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
				//Case 'D' allows the user to view their most recent transaction using	
			case 'D':	
				System.out.println("=============================");
				getPreviousTransaction();
				System.out.println("=============================");
				System.out.println();
				break;
				//Case 'E' allows the user to view their most recent transaction using	
			case 'E':	
				System.out.println("Enter how many years of accured intrest: ");
				break;
				//case 'F' exits the user from their account
			case 'F':	
				System.out.println("=============================");
				break;
				//The default case let's the user know that they entered an invalid character
				default:
					System.out.println("Errors: invalid option. Please enter A,B,C,D,E,F");
					break;
			}
		} While(option != 'F');

	} 
 
		
	
}
**/


import java.util.Scanner;

public class Account {
    // Class variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    // Class constructor
    Account(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    // Function for depositing money
    void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    // Function for Withdrawing money
    void withdraw(int amount) {
        if (amount > 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    // Function showing the previous transaction
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: Rs" + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: Rs" + Math.abs(previousTransaction));
        } else {
            System.out.println("No Transaction occurred");
        }
    }

    // Function calculating interest on current funds after a number of years
    void calculateInterest(int years) {
        double interestRate = 0.0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest Rate is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, your balance will be: Rs" + newBalance);
    }

    // Function showing the main menu
    void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println("\nWhat would you like to do?\n");
        System.out.println("A. CHECK BALANCE");
        System.out.println("B. MAKE B DEPOSIT");
        System.out.println("C. MAKE C WITHDRAWAL");
        System.out.println("D. VIEW PREVIOUS TRANSACTION");
        System.out.println("E. CALCULATE INTEREST");
        System.out.println("F. EXIT");

        do {
            System.out.println("\nEnter an option: ");
            option = scanner.next().charAt(0);
            option = Character.toUpperCase(option);
            System.out.println();

            switch (option) {
                case 'A':
                    System.out.println("==============================");
                    System.out.println("Balance = Rs" + balance);
                    System.out.println("==============================");
                    break;
                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    deposit(depositAmount);
                    break;
                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    break;
                case 'D':
                    System.out.println("=============================");
                    getPreviousTransaction();
                    System.out.println("=============================");
                    break;
                case 'E':
                    System.out.println("Enter how many years of accrued interest: ");
                    int years = scanner.nextInt();
                    calculateInterest(years);
                    break;
                case 'F':
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Error: Invalid option. Please enter A, B, C, D, E, or F");
                    break;
            }
        } while (option != 'F');
    }
}


import java.util.Scanner;

class ATM{
    private BankAccount account;
    public ATM(BankAccount account){
        this.account = account;
    }

    public void displayMenu(){
        System.out.println("ATM Menu");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        System.out.println("Enter your choice:");
 
    }

public void withdraw(double amount){
    if(amount > 0 && amount <= account.getBalance()){
        account.withdraw(amount);

        System.out.println("Withdrawal successful.New balance:" + account.getBalance());
    }

    else{
        System.out.println("Insufficient balance or invalid amount");
    }
    
}

public void deposit(double amount){
    if(amount > 0){
        account.deposit(amount);
        System.out.println("Deposit successful.New Balance:" + account.getBalance());
    }

    else{
        System.out.println("Invalid amount.");
    }
}

public void checkBalance(){
    System.out.println("Your current balance is:" + account.getBalance());
}
}

class BankAccount {
private double balance;
public BankAccount(double initialBalance){
    this.balance = initialBalance;
}

public double getBalance(){
    return balance;
}

public void withdraw(double amount){
balance += amount;
}

public void deposit(double amount){
    balance += amount;
}
}


public class ATM{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BankAccount account= new BankAccount(1000.0);
    ATM atm = new ATM(account);

    while (true) {
        atm.displayMenu();
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Enter withdrawalAmount:");
            double withdrawAmount = sc.nextDouble();
            atm.withdraw(withdrawAmount);
                
                break;
        
                case 2:
                System.out.println("Enter deposit amount:");
                double depositAmount = sc.nextDouble();
                atm.deposit(depositAmount);
                break;
        
                case 3:
                atm.checkBalance();
                break;
        
                case 4:
                System.out.println("Thank you fir using the ATM.");
                System.exit(0);
                break;
        

            default:
            System.out.println("Invalid choice");
                break;
        }
    }
}
    
}
    

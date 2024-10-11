import java.util.Scanner;

interface ATM {
    double withdraw();
    double deposit();
    void checkBalance();
}
class BankAccount implements ATM {
    protected double balance;
    private Scanner ss = new Scanner(System.in); 

    public double withdraw() {
        System.out.println("Enter amount to withdraw:");
        double amount = ss.nextDouble();
        if (amount > balance) {
            System.out.println("Balance is not sufficient.");
            return 0; 
        } else if (amount < 0) {
            System.out.println("Amount should be positive.");
            return 0; 
        } else {
            balance -= amount; 
            System.out.println("Withdrawal successful! Amount: " + amount);
            return amount; 
        }
    }

    public double deposit() {
        System.out.println("Enter amount to deposit:");
        double amount = ss.nextDouble();
        if (amount < 0) {
            System.out.println("Amount should be positive.");
            return 0;
        }
        balance += amount; 
        System.out.println("Amount deposited successfully.");
        return amount; 
    }

    public void checkBalance() {
        System.out.println("Balance amount: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        System.out.println("Enter initial balance:");
        account.balance = account.ss.nextDouble(); 
        
        while (true) {
            System.out.println("**Display of Menu**");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter an option from above: ");
            int option = account.ss.nextInt();

            switch (option) {
                case 1:
                    account.deposit();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Enter a valid option!");
            }
        }
    }
}

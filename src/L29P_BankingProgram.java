import java.util.Scanner;

public class L29P_BankingProgram {
    static Scanner sc = new Scanner(System.in);
    // or you could create a scanner object in each method

    // A static method(main) can directly access only static members (variables and methods).
    // It cannot directly access instance (non-static) members because a static method belongs to the class, not to any particular object.
    public static void main(String[] args) {

        double balance=0;
        boolean isRunning=true;
        int choice;

        while(isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance+=deposit();
                case 3 -> balance-=withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("***************");
        System.out.println("Thank you for using our BankingProgram");
        System.out.println("***************");
    }

    static void showBalance(double balance){
        System.out.println("***************");
        System.out.println("The current balance is: $"+balance);
    }

    static double deposit(){
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount=sc.nextInt();

        if(amount<0) System.out.println("Amount cannot be negative");
        else return amount;
        return 0;
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount=sc.nextInt();

        if(amount>balance) System.out.println("Insufficient funds");
        else if(amount<0) System.out.println("Amount cannot be negative");
        else return amount;
        return 0;
    }
}

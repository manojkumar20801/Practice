import java.util.Scanner;

public class BankingSystem {
    static double balance = 0;

    static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    static void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter amount: ");
                    deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    withdraw(sc.nextDouble());
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
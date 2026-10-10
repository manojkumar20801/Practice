import java.util.Scanner;

public class BankingSystem {

    static double balance = 0;
    static int transactionCount = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n============= BANKING SYSTEM =============");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Transaction Count");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        transactionCount++;

                        System.out.println(
                            "Amount deposited successfully."
                        );
                        System.out.println(
                            "Current Balance: " + balance
                        );
                    } else {
                        System.out.println(
                            "Invalid deposit amount."
                        );
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {

                        System.out.println(
                            "Invalid withdrawal amount."
                        );

                    } else if (withdraw > balance) {

                        System.out.println(
                            "Insufficient balance."
                        );

                    } else {

                        balance = balance - withdraw;
                        transactionCount++;

                        System.out.println(
                            "Amount withdrawn successfully."
                        );
                        System.out.println(
                            "Current Balance: " + balance
                        );
                    }
                    break;

                case 3:
                    System.out.println(
                        "Current Balance: " + balance
                    );
                    break;

                case 4:
                    System.out.println(
                        "Transaction Count: " + transactionCount
                    );
                    break;

                case 5:
                    System.out.println(
                        "Thank you for using the Banking System."
                    );
                    sc.close();
                    return;

                default:
                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }
        }
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author Manoj
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

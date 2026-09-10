
package atm;


import java.util.Scanner;


public class Main {

    private static String balance;


    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
        
          while (true) {

            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = s.nextInt();

            try {

                if (choice == 1) {

                    System.out.print("Enter withdrawal amount: ");
                    double amount = s.nextDouble();

                    withdraw(amount);

                } else if (choice == 2) {

                    System.out.println("Current Balance: " + balance);

                } else if (choice == 3) {

                    System.out.println("Thank you!");
                    break;

                } else {

                    System.out.println("Invalid choice.");
                }

            } catch (Exception e) {

                System.out.println("Error: " + e.getMessage());
            }
        }
        
    }

    private static void withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartloggin;

/**
 *
 * @author Manoj
 */
public class SmartLoginSystem {
    
     String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 0;

        while (attempts < 3) {

            System.out.println("\n--- LOGIN SYSTEM ---");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) {
                System.out.println("System exited.");
                break;
            }

            if (choice != 1) {
                System.out.println("Invalid choice.");
                continue;
            }

            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername)
                    && password.equals(correctPassword)) {

                System.out.println("Login Successful!");
                break;

            } else {

                attempts++;

                int remaining = 3 - attempts;

                System.out.println("Invalid credentials.");

                if (remaining > 0) {

                    System.out.println(
                        "Remaining attempts: " + remaining
                    );

                } else {

                    try {
                        throw new AccountLockedException(
                            "Account is locked!"
                        );

                    } catch (AccountLockedException e) {

                        System.out.println(e.getMessage());
                    }
                }
            }
        }

}

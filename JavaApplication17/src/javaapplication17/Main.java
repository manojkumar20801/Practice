
package javaapplication17;

import java.util.Scanner;

class Employee {

    int employeeId;
    String name;
    String department;

    Employee(int employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("-------------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];

        int count = 0;

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (count >= 100) {
                        System.out.println("Employee limit reached.");
                        break;
                    }

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    employees[count] =
                            new Employee(id, name, department);

                    count++;

                    System.out.println(
                            "Employee added successfully."
                    );

                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No employees found.");
                    } else {

                        System.out.println("\n--- Employee Details ---");

                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].employeeId == searchId) {

                            System.out.println("\nEmployee Found!");
                            employees[i].display();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }

                    break;

                case 4:

                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}

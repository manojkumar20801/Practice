/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author Manoj
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Create / open file
            FileWriter writer = new FileWriter("biodata.txt");

            // Personal Details
            System.out.println("===== PERSONAL DETAILS =====");

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            String age = sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Date of Birth: ");
            String dob = sc.nextLine();

            System.out.print("Enter Blood Group: ");
            String bloodGroup = sc.nextLine();


            // Educational Details
            System.out.println("\n===== EDUCATIONAL DETAILS =====");

            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Enter College Name: ");
            String college = sc.nextLine();

            System.out.print("Enter Percentage / CGPA: ");
            String cgpa = sc.nextLine();


            // Professional Details
            System.out.println("\n===== PROFESSIONAL DETAILS =====");

            System.out.print("Enter Skills: ");
            String skills = sc.nextLine();

            System.out.print("Enter Experience (in years): ");
            String experience = sc.nextLine();


            // Contact Details
            System.out.println("\n===== CONTACT DETAILS =====");

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();


            // Family Details
            System.out.println("\n===== FAMILY DETAILS =====");

            System.out.print("Enter Father Name: ");
            String fatherName = sc.nextLine();

            System.out.print("Enter Mother Name: ");
            String motherName = sc.nextLine();


            // Write data into file
            writer.write("========================================\n");
            writer.write("              BIO DATA\n");
            writer.write("========================================\n\n");

            writer.write("PERSONAL DETAILS\n");
            writer.write("----------------------------------------\n");
            writer.write("Name          : " + name + "\n");
            writer.write("Age           : " + age + "\n");
            writer.write("Gender        : " + gender + "\n");
            writer.write("DOB           : " + dob + "\n");
            writer.write("Blood Group   : " + bloodGroup + "\n\n");

            writer.write("EDUCATION\n");
            writer.write("----------------------------------------\n");
            writer.write("Qualification : " + qualification + "\n");
            writer.write("College       : " + college + "\n");
            writer.write("CGPA          : " + cgpa + "\n\n");

            writer.write("PROFESSIONAL DETAILS\n");
            writer.write("----------------------------------------\n");
            writer.write("Skills        : " + skills + "\n");
            writer.write("Experience    : " + experience + " Years\n\n");

            writer.write("CONTACT DETAILS\n");
            writer.write("----------------------------------------\n");
            writer.write("Phone         : " + phone + "\n");
            writer.write("Email         : " + email + "\n");
            writer.write("Address       : " + address + "\n\n");

            writer.write("FAMILY DETAILS\n");
            writer.write("----------------------------------------\n");
            writer.write("Father Name   : " + fatherName + "\n");
            writer.write("Mother Name   : " + motherName + "\n\n");

            writer.write("========================================\n");

            // Close FileWriter
            writer.close();

            System.out.println("\nBio Data saved successfully!");
            System.out.println("File created: biodata.txt");

        } catch (IOException e) {

            System.out.println("An error occurred while writing the file.");
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
    }
    
}

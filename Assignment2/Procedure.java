/*
 * Class: CMSC203-22355 
 * Instructor: David Kuijt
 * Description: The main application class that interacts with the user and manages the Patient and Procedure objects.
 * Due: 10/08/2024
 * Platform/compiler: Windows/Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Tuan Pho
*/

import java.util.Scanner;

public class PatientDriverApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient's first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter patient's middle name:");
        String middleName = scanner.nextLine();

        System.out.println("Enter patient's last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter patient's address:");
        String address = scanner.nextLine();

        System.out.println("Enter patient's city:");
        String city = scanner.nextLine();

        System.out.println("Enter patient's state:");
        String state = scanner.nextLine();

        System.out.println("Enter patient's zip code:");
        String zip = scanner.nextLine();

        System.out.println("Enter patient's phone number:");
        String phone = scanner.nextLine();

        System.out.println("Enter emergency contact's name:");
        String emergencyContactName = scanner.nextLine();

        System.out.println("Enter emergency contact's phone:");
        String emergencyContactPhone = scanner.nextLine();

        Patient patient = new Patient(firstName, middleName, lastName, address, city, state, zip, phone,
                emergencyContactName, emergencyContactPhone);

        Procedure procedure1 = new Procedure();
        procedure1.setProcName("Physical Exam");
        procedure1.setProcDate("10/24/2023");
        procedure1.setProcPractitioner("Dr. Irvine");
        procedure1.setProcCharges(3250.00);

        Procedure procedure2 = new Procedure();
        procedure2.setProcName("X-ray");
        procedure2.setProcDate("10/24/2023");
        procedure2.setProcPractitioner("Dr. Jamison");
        procedure2.setProcCharges(5500.43);

        Procedure procedure3 = new Procedure();
        procedure3.setProcName("Blood Test");
        procedure3.setProcDate("10/24/2023");
        procedure3.setProcPractitioner("Dr. Smith");
        procedure3.setProcCharges(1400.75);

        displayPatient(patient);
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%,.2f%n", totalCharges);

        scanner.close();
    }

    public static void displayPatient(Patient patient) {
        System.out.println("\nPatient Information:");
        System.out.println(patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println("\nProcedure Information:");
        System.out.println(procedure);
    }

    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getProcCharges() + procedure2.getProcCharges() + procedure3.getProcCharges();
    }
}

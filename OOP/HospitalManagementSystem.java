import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagementSystem {
    static ArrayList<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewPatients();
                    break;
                case 3:
                    searchPatient();
                    break;
                case 4:
                    deletePatient();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        patients.add(new Patient(id, name, age, disease));
        System.out.println("Patient added successfully!");
    }

    public static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }
        System.out.println("\nPatient List:");
        for (Patient p : patients) {
            p.display();
        }
    }

    public static void searchPatient() {
        System.out.print("Enter Patient ID to search: ");
        int id = sc.nextInt();
        for (Patient p : patients) {
            if (p.getId() == id) {
                p.display();
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    public static void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId() == id) {
                patients.remove(i);
                System.out.println("Patient record deleted successfully.");
                return;
            }
        }
        System.out.println("Patient not found.");
    }
}

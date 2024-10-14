import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementMain {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- STUDENT MANAGEMENT PROGRAM ---");
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. Search student");
            System.out.println("5. Sort students (choose Bubble Sort or Insertion Sort)");
            System.out.println("6. Display student list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Handle newline
                    System.out.print("Enter student full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter student marks: ");
                    double marks = scanner.nextDouble();
                    studentManagement.addStudent(new Student(id, fullName, marks));
                    break;

                case 2:
                    System.out.print("Enter student ID to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new full name: ");
                    String newFullName = scanner.nextLine();
                    System.out.print("Enter new marks: ");
                    double newMarks = scanner.nextDouble();
                    studentManagement.editStudent(editId, newFullName, newMarks);
                    break;

                case 3:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    studentManagement.deleteStudent(deleteId);
                    break;

                case 4:
                    System.out.print("Enter student ID to search: ");
                    int searchId = scanner.nextInt();
                    studentManagement.searchStudent(searchId);
                    break;

                case 5:
                    System.out.print("Choose sorting algorithm (bubble/insertion): ");
                    String sortType = scanner.next();
                    studentManagement.sortStudents(sortType);
                    break;

                case 6:
                    System.out.println("Student List:");
                    studentManagement.displayStudentList();
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();

    }
}
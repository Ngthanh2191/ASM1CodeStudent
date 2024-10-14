import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
        updateRank();
    }

    public void editStudent(int id, String newFullName, double newMarks) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.setFullName(newFullName);
                student.setMarks(newMarks);
                updateRank();
                return;
            }
        }
        System.out.println("Student with ID: " + id + " not found.");
    }

    public void deleteStudent(int id) {
        studentList.removeIf(student -> student.getId() == id);
        updateRank();
    }

    public void searchStudent(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student with ID: " + id + " not found.");
    }

    // Sorting students with two different algorithms
    public void sortStudents(String sortType) {
        if (sortType.equalsIgnoreCase("bubble")) {
            bubbleSort();
        } else if (sortType.equalsIgnoreCase("insertion")) {
            insertionSort();
        } else {
            System.out.println("Invalid choice.");
        }
        updateRank();
    }

    // Bubble Sort
    private void bubbleSort() {
        int n = studentList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (studentList.get(j).getMarks() < studentList.get(j + 1).getMarks()) {
                    // Swap students
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorting by Bubble Sort completed.");
    }

    // Insertion Sort
    private void insertionSort() {
        int n = studentList.size();
        for (int i = 1; i < n; i++) {
            Student key = studentList.get(i);
            int j = i - 1;
            while (j >= 0 && studentList.get(j).getMarks() < key.getMarks()) {
                studentList.set(j + 1, studentList.get(j));
                j = j - 1;
            }
            studentList.set(j + 1, key);
        }
        System.out.println("Sorting by Insertion Sort completed.");
    }

    public void displayStudentList() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    private void updateRank() {
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).setRank(i + 1);
        }
    }
}
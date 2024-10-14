import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int id;
    private String fullName;
    private double marks;
    private int rank;

    public Student(int id, String fullName, double marks) {
        this.id = id;
        this.fullName = fullName;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + fullName + ", Marks: " + marks + ", Rank: " + rank;
    }
}

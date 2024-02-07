package task4.question4;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    Map<String, Integer> studentGrades = new HashMap<>();

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade :" + grade);
        } else {
            System.out.println("Student '" + name + "' not found.");
        }
    }

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();

        // Adding students

        studentGrades.addStudent("ram", 90);
        studentGrades.addStudent("sita", 85);
        studentGrades.addStudent("raj", 75);

        // Displaying grades
        studentGrades.displayGrade("ram");
        studentGrades.displayGrade("sita");
        studentGrades.displayGrade("raj");

        // Removing a student
        studentGrades.removeStudent("ram");

        // Displaying grades after removal
        studentGrades.displayGrade("ram"); // Bob should not be found after removal
    }
}

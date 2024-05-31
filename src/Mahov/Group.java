package Mahov;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupNumber;
    private ArrayList<Student> students;

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.size() < 20) {
            students.add(student);
        } else {
            System.out.println("Group " + groupNumber + " is full!");
        }
    }

    public void displayStudents() {
        System.out.println("Группа " + groupNumber + ":");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

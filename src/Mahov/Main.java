package Mahov;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group(1);
        Group group2 = new Group(2);
        Group group3 = new Group(3);

        // Create students
//        Student.CreateStudents();
        Student student1 = new Student("Вадим", "Горшков", 20);
        Student student2 = new Student("Михаил", "Матюшев", 21);
        Student student3 = new Student("Максим", "Дуванов", 22);
        Student student4 = new Student("Алексеей", "Смирнов", 23);
        Student student5 = new Student("Вадим", "Демин", 24);
        Student student6 = new Student("Иван", "Парфенов", 25);
        Student student7 = new Student("Назар", "Бекназаров", 26);
        Student student8 = new Student("Леонардо", "Дикабрио", 27);
        Student student9 = new Student("Райан", "Гослинг", 28);
        Student student10 = new Student("Саша", "Грей", 29);

        // Add students to groups
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);

        group2.addStudent(student5);
        group2.addStudent(student6);
        group2.addStudent(student7);

        group3.addStudent(student8);
        group3.addStudent(student9);
        group3.addStudent(student10);

        // Display students in each group
        group1.displayStudents();
        group2.displayStudents();
        group3.displayStudents();


    }
}

package practic;

public class Dog {
    String name;
    String breed;
    double weight;
    int speed;
    // конструктор
    Dog(String name, String bread, double weight, int speed) {
        this.name = name;
        this.breed = bread;
        this.weight = weight;
        this.speed = speed;
    }
    // методы
    String InfoDog() {
    return "Имя " + name + " Порода " + breed + " Вес " + weight;
    }
    void run() {
        for (int i = 0; i < speed; i++ ) {
            System.out.printf("\nБегу");
        }

    }
}

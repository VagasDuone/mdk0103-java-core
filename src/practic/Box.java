package practic;

public class Box {
    double length;
    double width;
    double height;

    // конструктор без параметров
    Box() {
        this(10);
    }
    //конструктор
    Box(double length, double width, double height) {
        this.height = length;
        this.length = width;
        this.width = height;
    }
    Box(double size) {
        this(size, size, size);

    }
    //метод с параметром
    void setDimens(double length, double width, double height) {
         this.height = length;
         this.length = width;
         this.width = height;
    }

    // методы
    void ShowVolume() {
        System.out.println(getVolume());

    }
    double getVolume() {
       return length * width * height;

    }
}

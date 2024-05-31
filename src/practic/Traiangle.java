package practic;

import java.util.Scanner;

//методы с параметрами
public class Traiangle {
    double length;
    double width;
// метод с параметрами
    void Parametriz(double length, double width) {
        this.width = length;
        this.length = width;


    }

    double Ploshat() {
        return this.length * width;
    }
}

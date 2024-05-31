package practic;
//конструкторы
public class Eployess {
    String name;
    String position;
    int payment;

//     void SetEployess(String name, String post, int payment) {
//       this.name = name;
//       this.post = post;
//       this.payment = payment;
//    }


    Eployess(String name, String position, int payment) {
        this.name = name;
        this.position = position;
        this.payment = payment;
    }

    void ShowInfo() {
        System.out.println("Name " + this.name + "\nPosition " + this.position + "\nsalary " + this.payment + "$");
    }
}

package practic;

public class Monster {
    int quantity_eyes;
    int quantity_hands;
    int quantity_lags;

     Monster(int quantity_glass,int quantity_hands, int quantity_lags) {
        this.quantity_eyes = quantity_glass;
        this.quantity_hands = quantity_hands;
        this.quantity_lags = quantity_lags;
    }
    Monster() {
    this(2);
    }
    Monster( int amount) {
      this(amount, amount,amount);
    }

    void voice() {
        voice(1);
    }
    void voice(int count) {
        voice(count,"brrrrrr");
    }
    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }



}

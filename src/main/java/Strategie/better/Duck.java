package Strategie.better;

public class Duck {
    Quackable quackable;
    Flyable flyable;

    public Duck() {

    }

    public Duck(Quackable quackable, Flyable flyable) {
        this.quackable = quackable;
        this.flyable = flyable;
    }

}

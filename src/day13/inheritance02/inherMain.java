package day13.inheritance02;

public class inherMain {
    public static void main(String[] args) {
        Cat objCat = new Cat();
        Dog objDog = new Dog();

        objCat.meow();
        objCat.eat();
        objDog.bark();
        objDog.eat();
    }
}

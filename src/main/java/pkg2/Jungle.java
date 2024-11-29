package pkg2;

public class Jungle {
    public static void main(String[] args) {
        Animal a1 = new Dog(); //upcasting
        Animal a2 = new Cat();
        a1.eat();
        a1.walk();
        a2.eat();
        a2.walk();
    }
}

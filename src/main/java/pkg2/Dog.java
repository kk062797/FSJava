package pkg2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println("pkg2.Dog Constructor invoked");
    }

    public void walk(){
        System.out.println("pkg2.Animal is walking");
    }
}

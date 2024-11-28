package pkg2;

public class Animal {

    String name;

    public Animal(String name){
        System.out.println("pkg2.Animal Constructor invoked");
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
}

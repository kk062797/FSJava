package pkg2;

public class Student {

    String name;  //null

    int rollNo;  //o

    int a = 7;  //0

    public Student(String name) {
        this.name = name;
    }

    public void getName(){
        System.out.println("Name is "+this.name);
    }
}

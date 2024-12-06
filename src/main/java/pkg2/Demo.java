package pkg2;

public class Demo {

    public static void main(String[] args) {
        School s1 = new School();

        for(Student s: s1.getStudents() ) {
            s.getName();
        }

    }
}

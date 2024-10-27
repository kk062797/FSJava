public class DummyRun {

    public static void main(String[] args) {

        School sc1 = new School();
        sc1.name = "Arjun";
        sc1.address = "Patna";
        sc1.principal = "Mr Joseph";

        Teacher t1 = new Teacher();
        t1.name = "Akhil";
        t1.subject = "Testing Fundamentals and Automation";

        Student s1 = new Student();
        s1.name= "Kanishk";
        s1.age = 26;

        ClassRoom cr1 = new ClassRoom();
        cr1.floorNo = 4;
        cr1.seatingCapacity = 250;

    }
}

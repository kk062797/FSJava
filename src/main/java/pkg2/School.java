package pkg2;

public class School {

    Student[] students = new Student[2];  //null


    int schoolId;  //0
    String schoolName;   //null

    public Student[] getStudents() {

        students[0] = new Student("Akhil");
        students[1] = new Student("Jain");

        return students;
    }
}

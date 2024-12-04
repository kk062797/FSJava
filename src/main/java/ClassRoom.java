public class ClassRoom {

    Student[] student = new Student[5];

    public int getStudentCount(int num){
        int c =0;
        try {
            c = 5/num;   //Arithmetric excelption: RunTime: unchecked
            Student s = student[6];  //ArrayOOBException

            System.out.println("Line after Exception occured!");

        } catch (ArithmeticException e) {
            System.out.println("Handled by ArithmeticException");
            c = 10;
        }
        catch (RuntimeException e) {
            System.out.println("Handled by RunTime");
            //e.printStackTrace();

            c = 20;
        } /*finally {
            System.out.println("Final Block");
            c= 30;
        }*/




        Student s1 = new Student("Atul");
        Student s2 = new Student("Ananya");

        return c;
    }
}

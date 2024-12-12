import java.util.*;

public class ComplexCollectionDemo {

    public static void main(String[] args) {

        System.out.println("Name | Gender | Location");

        List<String> row1 = new ArrayList <String>();
        row1.add("Kanishk");
        row1.add("Male");
        row1.add("Bengaluru");

        List<String> row2 = new ArrayList <String>();
        row2.add("Sayali");
        row2.add("Female");
        row2.add("Pune");

        List<String> row3 = new ArrayList <String>();
        row3.add("Prateek");
        row3.add("Male");
        row3.add("Noida");

        List<String> row4 = new ArrayList <String>();
        row4.add("Shreya");
        row4.add("Female");
        row4.add("Hyderabad");

        List<List<String>> table = new ArrayList <List<String>>();
        table.add(row1);
        table.add(row2);
        table.add(row3);
        table.add(row4);

        for(List<String> l : table){
            System.out.println(l.get(0)+" |"+l.get(1)+" |"+l.get(2));
        }
    }
}

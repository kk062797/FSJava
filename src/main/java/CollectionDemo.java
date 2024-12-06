import java.util.*;


public class CollectionDemo {
    public static void main(String[] args) {
        System.out.println("-----------------Arrays----------------------------");
        //Arrays
        String[] guestArray = new String[3];
        guestArray[0] = "Kanishk";
        guestArray[1] = "Kakku";
        guestArray[2] = "Sayali";

        for (String a : guestArray) {
            System.out.println(a);
        }
        System.out.println("------------------List---------------------------");
        //List
        List <String>guestList = new ArrayList<String>();
        guestList.add("Kakku");
        guestList.add("Kanishk");
        guestList.add("Sayali");
        guestList.add("Sayali");

        for (String l : guestList) {
            System.out.println(l);
        }
        System.out.println("----------------Set-----------------------------");
        //Set
        Set <String>guestSet = new HashSet<String>();
        guestSet.add("Kakku");
        guestSet.add("Kanishk");
        guestSet.add("Sayali");
        guestSet.add("Sayali");

        for (String s : guestSet) {
            System.out.println(s);
        }
        System.out.println("-------------------Map--------------------------");
        //Map
        Map<Integer,String>guestMap = new HashMap<Integer,String>();
        guestMap.put(1, "Kakku");
        guestMap.put(2, "Kanishk");
        guestMap.put(3, "Sayali");
        guestMap.put(2, "Sayali");
        guestMap.put(4, "Kanishk");

        for (Integer m : guestMap.keySet()) {
            System.out.println(m+" "+guestMap.get(m));
        }
    }


}

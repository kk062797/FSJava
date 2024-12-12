import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Demo.mapDemo();
    }

    public void setDemo() {

    }

    public static void mapDemo() {
        Map<Integer, String> countryMap = new HashMap<Integer, String>();

        countryMap.put(1, "India");
        countryMap.put(2, "Nepal");
        countryMap.put(3, "China");
        countryMap.put(4, "Bhutan");
        countryMap.put(5, "Myanmar");

        //size
        System.out.println(countryMap.size());


        //delete
        countryMap.remove(3);
        countryMap.remove(5, "Myanmar");

        for (Integer i : countryMap.keySet()) {
            System.out.println(countryMap.get(i));
        }
        //get
        System.out.println(countryMap.get(4));

        //Search
        System.out.println(countryMap.containsKey(1));
        System.out.println(countryMap.containsValue("Nepal"));

        //Iterate
        Set<Integer> countrySet = countryMap.keySet();
        Iterator<Integer> countryIterator = countrySet.iterator();
        int k = 0;
        while (countryIterator.hasNext()){
            k = countryIterator.next();
            System.out.println(k+" "+countryMap.get(k));
        }

        Iterator<String> mapValue = countryMap.values().iterator();

        while (mapValue.hasNext()){

            System.out.println(mapValue.next());
        }
    }

    public void listDemo() {


        List<String> countryName = new ArrayList<String>();

        //Addition
        countryName.add("India");
        countryName.add("China");
        countryName.add("Japan");
        countryName.add("Nepal");
        countryName.add("Bhutan");
        countryName.add("Thailand");


        //Size
        System.out.println(countryName.size());

        //deletion
        countryName.remove("China");
        countryName.remove(1);

        System.out.println(countryName.size());

        //Search
        boolean isExist = countryName.contains("SriLanka");
        System.out.println(isExist);

        //Find the items bases on index positions
        System.out.println(countryName.get(2));

        //Find the index positions
        System.out.println(countryName.indexOf("Bhutan"));
        countryName.set(0, "Bharat");
        System.out.println("------------------------------------------------");
        for (String s : countryName) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------");
        Iterator<String> i = countryName.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}

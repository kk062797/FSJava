public class Demo {
    public static void main(String[] args) {
        /*
        Calculator c1 = new Calculator();
        c1.add();
        c1.add(2,5);
        c1.add(10f,20f);
         */

        /*ScientificCalculator sc = new ScientificCalculator();
        System.out.println(sc.add(4,6));
         */
        Calculator c1 = new Calculator();
        ScientificCalculator sc = new ScientificCalculator();
        Calculator c2 = new ScientificCalculator();//upcasting
        c1.add(2,3);
        sc.add(2,3);
        c2.add(2,3);
        ScientificCalculator sc1 = (ScientificCalculator) c2;
        ScientificCalculator sc2 = (ScientificCalculator) new ScientificCalculator();
        ScientificCalculator sc3 = new ScientificCalculator();
        sc1.add(2,3);
        sc2.add(2,3);
        sc2.add(2,3);

    }
}

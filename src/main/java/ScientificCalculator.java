public class ScientificCalculator extends Calculator{

    public int add(int a,int b,String s){
        System.out.println("S value" + s);
        return a+b+10;
    }

    public int add(int a,int b){
        int c = a+b+10;
        System.out.println(c);
        return c;
    }
}

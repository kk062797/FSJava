import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {

    public static void main(String[] args) {
         int i = 5;

         //Boxing
         Integer val1 = Integer.valueOf(i);
         Character ch1 = Character.valueOf('c');
         Float fl1 = Float.valueOf(3.6f);

         //UnBoxing
        int res1 = val1.intValue();
        char res2 = ch1.charValue();
        float res3 = fl1.floatValue();

        //AutoBoxing

        Integer inti = 5;

        List <Integer> l1 = new ArrayList<Integer>();
        l1.add(Integer.valueOf(5)); //Boxing
        l1.add(5); //AutoBoxing
    }
}

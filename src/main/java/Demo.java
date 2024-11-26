public class Demo {
    public static void main(String[] args) {
        /*
        String [] name = new String [] {"Ravi","Kashish","Alex","Irfan","Catherine","Rabia"};

        for(String s : name){
            System.out.println(s);
        }
         */

        Animal lion = new Animal("lion");
        Animal tiger = new Animal("tiger");
        Animal jaguar = new Animal("jaguar");

        Animal[] animal = new Animal[]{lion, tiger, jaguar};

        for (Animal s : animal) {
            s.animalName();
            //System.out.println(animals.name);
        }
    }
}

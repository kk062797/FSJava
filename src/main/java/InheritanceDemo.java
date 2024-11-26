public class InheritanceDemo {
    public static void main(String[] args) {
         Dog d = new Dog();
        System.out.println(d.name);
        d.getDetails();

        Puppy p = new Puppy();
        System.out.println(p.name);
        p.getDetails();
    }
}

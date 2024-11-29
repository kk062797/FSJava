package pkg1;

public class Maruti implements Car {
    @Override
    public void drive() {
        System.out.println("Maruti is driving");
    }

    @Override
    public void playMusic() {
        System.out.println("Maruti is playing music");
    }
}

package pkg1;

public interface TakeScreenShot {

    void take();

    default void manage(){
        System.out.println("TakeScreenShot manage method");
    }

    static void navigateTo(){
        System.out.println("TakeScreenShot navigateTo method");
    }


}

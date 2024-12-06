package pkg1;

public interface WebDriver {

    void get();

    void findElement();

    default void manage(){
        System.out.println("WebDriver manage method");
    }

    static void navigateTo(){
        System.out.println("WebDriver navigateTo method");
    }
}

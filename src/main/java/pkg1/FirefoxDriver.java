package pkg1;

public class FirefoxDriver implements WebDriver,TakeScreenShot {
    public void get() {
        System.out.println("FirefoxDriver get method");
    }

    public void findElement() {
        System.out.println("FirefoxDriver FindElement method");
    }

    public void take() {
        System.out.println("FirefoxDriver take method");
    }

    public void manage() {
        System.out.println("FirefoxDriver manage method");
    }

}

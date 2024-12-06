package pkg1;

public class ChromeDriver implements WebDriver,TakeScreenShot {


    public void get() {
        System.out.println("ChromeDriver get method");
    }

    public void findElement() {
        System.out.println("ChromeDriver FindElement method");
    }

    public void take() {
        System.out.println("ChromeDriver take method");
    }

    public void manage() {
        System.out.println("ChromeDriver manage method");
    }
}

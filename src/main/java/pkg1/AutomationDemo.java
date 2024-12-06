package pkg1;

public class AutomationDemo {
    public static void main(String[] args) {

        ChromeDriver cd = new ChromeDriver();
        cd.get();
        cd.findElement();
        cd.manage();
        cd.take();
        FirefoxDriver fd = new FirefoxDriver();
        fd.get();
        fd.findElement();
        fd.manage();
        cd.take();
        WebDriver.navigateTo();
        TakeScreenShot.navigateTo();
    }
}

package practiceVideos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        //connect to webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //iniciate webdrive
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        //how to navigate
        driver.navigate().to("https://www.facebook.com/" );
        //go back, we can navigate back with navigate.
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        //goto facebook
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();
    }
}

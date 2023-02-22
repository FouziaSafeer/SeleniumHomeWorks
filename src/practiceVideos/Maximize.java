package practiceVideos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        //connect driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //iniciate webdrive
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.close();
    }
}

package lectureNo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //iniciate webdrive
        WebDriver driver1=new ChromeDriver();
        driver1.manage().window().maximize();
        //print all the link of amazon
        driver1.get("https://www.amazon.co.uk/");

        driver1.findElements(By.tagName("a"));
        //to
    }
}

package classNo6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Implicitwait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//IMPLECENT
        String url ="https://www.facebook.com/";
        driver.get(url);

        if(driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).isDisplayed()){
            driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
        }


        driver.findElement(By.linkText("Create new account")).click();

       // Thread.sleep(2000);
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



        driver.findElement(By.name("firstname")).sendKeys("Fouzia");
        driver.findElement(By.name("lastname")).sendKeys("Saferr");


}
}
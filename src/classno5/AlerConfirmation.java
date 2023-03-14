package classno5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerConfirmation {
   // public static void main(String[] args) {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
            driver.get(url);
            driver.findElement(By.xpath("//button[text()='Click me!'][1]")).click();


            /// how to deal alert
            Alert alert=driver.switchTo().alert();//focus at alert
            Thread.sleep(1000);
            alert.accept();


            driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
          /*  Alert aler1=driver.switchTo().alert();
            aler1.sendKeys("fouzia");
            aler1.accept();*/
            Thread.sleep(1000);
            alert.sendKeys("fouzia");
            alert.accept();


    }
}

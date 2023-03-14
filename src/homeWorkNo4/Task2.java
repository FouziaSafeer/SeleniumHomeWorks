package homeWorkNo4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
        2.Switch to the iframe on the page
        3.Clear the existing text in the  editor inside the iframe
        4.Enter the text "Hello World!" in the editor inside the iframe
        5.Switch back to the main page*/
        String url="https://the-internet.herokuapp.com/iframe";
        driver.get(url);


     driver.switchTo().frame(0);
   WebElement textfield=  driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
    textfield.clear();
    textfield.sendKeys("Hello World!");
    driver.switchTo().defaultContent();




       //WebElement frame1 =driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
  //  driver.switchTo().frame("mce_0_ifr");
     //   driver.switchTo().frame(0);
       // WebElement textfield2=  driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
       // textfield2.sendKeys("12315465");

    }
}

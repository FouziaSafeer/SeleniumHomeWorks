package homeWorkNo4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class Task1 {

    /*HW
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.Verify that the text "Hello World!" is now displayed on the page*/
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        String url="https://the-internet.herokuapp.com/dynamic_loading/1";
        driver.get(url);

       WebElement button= driver.findElement(By.xpath( "//button[text()='Start']"));
       button.click();


       WebElement finish= driver.findElement(By.xpath("//div[@id='finish']"));
       finish.click();
        String text= driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
        System.out.println("Text Displayed: "+ text);

        driver.close();

    }

}
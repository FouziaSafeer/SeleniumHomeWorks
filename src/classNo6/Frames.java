package classNo6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {


        // //http://www.uitestpractice.com/students/switchto
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url="http://www.uitestpractice.com/students/switchto";
        driver.get(url);

        //1)switch ti iframe in put by index
        driver.switchTo().frame(0);
        //this will switch focus to frame
       WebElement textbox= driver.findElement(By.xpath("//input[@id='name']"));

       textbox.sendKeys("fizzy");//send data to texctbox

        //get the text move the focus back
        driver.switchTo().defaultContent();
        //find the text
        WebElement text= driver.findElement(By.xpath("//h3"));
        System.out.println(text.getText());

        //get the text
        driver.switchTo().frame("iframe_a");
        String text1=driver.findElement(By.xpath("//label[text()='Enter your name:']")).getText();
        System.out.println(text1);
        //focus back to main page
        driver.switchTo().defaultContent();


        WebElement frame1= driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textbox.clear();





    }
}
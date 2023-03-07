package lectureNo4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        //connect driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //iniciate webdrive
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        if(driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).isDisplayed()){
            driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
        }

        WebElement creatnewbtn=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        creatnewbtn.click();
        Thread.sleep(2000);
        WebElement username=driver.findElement(By.cssSelector("input[ name='firstname']"));
       // driver.findElement(By.name("firstname")).sendKeys("Fouzia");
        username.sendKeys("Fouzia");
//tagname[attribute*= ' partial attribute value'] for contains All



        //tagname.value refer to class name tagname.value
        //id='value'   we can write tagname#value
        //tagname[attribute^='starting attributr value]where ^measn start with, input[id^='abra']
        //b.ends with in css
        // tagname[attribute$='ending attribute value '] eg input[id $='hello']

        //http://practice.syntaxtechs.net/



    }
}

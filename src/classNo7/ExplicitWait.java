package classNo7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url ="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        //as it take time for to be visible after sometime
      //  WebDriverWait wait=new WebDriverWait(driver,20);
        WebDriverWait wait =new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
        //once the element is visible then get the text
        WebElement text= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String Welcome=text.getText();
        System.out.println(Welcome);
    }
}

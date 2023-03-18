package classNo8;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.ByAngularPartialButtonText;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DynamicTable2 {
    public static void main(String[] args) throws InterruptedException {
        //demo.guru99.com/test/web-table-element.php
        ////button[@id='denyAll']
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       JavascriptExecutor jse = (JavascriptExecutor) driver;
      //  NgWebDriver ngWebDriver = new NgWebDriver(jse);

//        max the window
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,20);
        String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
        driver.get(url);
        WebElement userId=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));//.sendKeys("Tester");
        userId.sendKeys("Tester");
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
        WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

        //task print all the enteries that have my money in the product
//1.locator for my prodcut coloum


        List<WebElement> products=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

//iterate
        for (int i = 0; i < products.size(); i++) {
           String text= products.get(i).getText();
           if(text.equalsIgnoreCase("MyMoney")){
               System.out.println("Money on index : "+i);
               System.out.println("Money on table:" +(i+2));
               WebElement checkbox=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+ (i+2)+"]/td[1]"));
               checkbox.click();

           }

        }


    }
}
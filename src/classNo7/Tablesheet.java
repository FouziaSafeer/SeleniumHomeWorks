package classNo7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Tablesheet {
    public static void main(String[] args) {
        //  tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        //WebDriver driver = new ChromeDriver();
//        max the window
       // driver.manage().window().maximize();

        //        create an instance of WebDriver
        ChromeOptions options = new ChromeOptions();
        Map<String , Object> prefs = new HashMap<String,Object>();
        prefs.put("profile.managed_default_content_settings.javascript",2);
        options.setExperimentalOption("prefs",prefs);
        WebDriver driver = new ChromeDriver(options);
//        max the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
       // driver.findElement(By.xpath("//button[text()='Continue with Recommended Cookies']")).click();
        driver.findElement(By.xpath("//button[text() = 'Continue with Recommended Cookies']")).click();
                //for cookies
               // driver.findElement(By.xpath("//button[text()='Continue with Recommended Cookies']")).click();

       // driver.findElement(By.xpath("//button[text()='Continue with Recommended Cookies']")).click();

    }
}
      /*  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //for cookies
        driver.findElement(By.xpath("//button[text()='Continue with Recommended Cookies']")).click();
        //for adversistement


        ChromeOptions options = new ChromeOptions();
        Map<String , Object> prefs = new HashMap<String,Object>();
        prefs.put("profile.managed_default_content_settings.javascript",2);
        options.setExperimentalOption("prefs",prefs);*/

        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("document.getElementById('dismiss-button').click();");

      //  WebElement eleCloseBtn = driver.findElement(By.xpath("//div[@id='dismiss-button' and @aria-label='Close ad']"));

               // if(eleCloseBtn.isDisplayed()){
                    //System.out.println("on the button");
                    //eleCloseBtn.click();

                //}
        //System.out.println("ele");

        //Alert alert = driver.switchTo().alert();


       // alert.dismiss();



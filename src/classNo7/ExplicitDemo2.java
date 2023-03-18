package classNo7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo2 {
    //https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
    public static void main(String[] args) {
        //  tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        String url="https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        driver.get(url);
        WebElement topButton= driver.findElement(By.xpath("//button[@id='alert']"));
        topButton.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();



    }
}

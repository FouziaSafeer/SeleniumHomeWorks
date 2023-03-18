package homeWorkNo5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExamples {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //open website
        driver.get(url);
        //maximize windows
        driver.manage().window().maximize();
        //first button
        WebElement firstButton= driver.findElement(By.xpath("//button[text()='Click me, to Open an alert after 5 seconds']"));
        firstButton.click();
       WebDriverWait  wait=new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        // second button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='h2']")));
        WebElement secondButton=driver.findElement(By.xpath("//button[text()='Change Text to Selenium Webdriver']"));
        secondButton.click();


        // third  button

        driver.findElement(By.xpath("//button[text()='Display button after 10 seconds']")) .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));

        //4th button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Button']")));
        driver.findElement(By.xpath("//button[text()='Enable button after 10 seconds']")) .click();


        // 5th button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ch']")));
        driver.findElement(By.xpath("//button[text()='Check Checkbox after 10 seconds']")).click();

       //driver.findElement(By.id("ch")).click();
    }
}

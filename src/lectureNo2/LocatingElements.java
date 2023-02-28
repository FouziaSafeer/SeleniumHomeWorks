package lectureNo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {


    //connect driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
    //iniciate webdrive
    WebDriver driver=new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
   // driver.manage().window().maximize();
    //send in the user
       // driver.findElement(By.id("email")).sendKeys("fouzia");
       // driver.findElement(By.name("pass")).sendKeys("password1");
      //  driver.findElement(By.name("login")).click();
        //click on botton
        driver.findElement(By.linkText("Create new account")).click();
       // driver.findElement(By.linkText("Create new account")).click();
        //click on forget passwork
       // driver.findElement(By.partialLinkText("password")).click();
}}

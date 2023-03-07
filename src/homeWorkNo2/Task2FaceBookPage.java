package homeWorkNo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2FaceBookPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com/";
        driver.get(url);
        driver.manage().window().maximize();

        if(driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).isDisplayed()){
           driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
       }

        driver.findElement(By.linkText("Create new account")).click();



        Thread.sleep(2000);
       driver.findElement(By.name("firstname")).sendKeys("Fouzia");
       driver.findElement(By.name("lastname")).sendKeys("Saferr");
       driver.findElement(By.name("reg_email__")).sendKeys("hello@gmail.com");
       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hello@gmail.com");
       driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
       driver.findElement(By.name("birthday_day")).sendKeys("10");
       driver.findElement(By.name("birthday_month")).sendKeys("Mar");
       driver.findElement(By.name("birthday_year")).sendKeys("2012");
       driver.findElement(By.className("_58mt")).click();
       driver.findElement(By.name("websubmit")).click();
       Thread.sleep(2000);
      // driver.close();




    }
}

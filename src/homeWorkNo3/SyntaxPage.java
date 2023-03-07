package homeWorkNo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://practice.syntaxtechs.net/basic-first-form-demo.php";
        driver.get(url);
        driver.manage().window().maximize();
     //   driver.findElement(By.id("user-message")).sendKeys(" I misses My Last class");

        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("I missed my class class");
       driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
       driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("2");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("5");
        driver.findElement(By.xpath("//button[@onclick='return total()']")).click();
        System.out.println("Arrtibute type: ");
        System.out.println("Total:" );
    }
}
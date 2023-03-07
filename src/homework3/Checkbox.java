package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url ="http://practice.syntaxtechs.net/basic-checkbox-demo.php";
        driver.get(url);
        driver.manage().window().maximize();
       Boolean selected= driver.findElement(By.xpath("//input  [@id='isAgeSelected']")).isSelected();
      if (selected==true){
          System.out.println("its selected");
      }else {
           driver.findElement(By.xpath("//input  [@id='isAgeSelected']")).click();
      }

    }
}

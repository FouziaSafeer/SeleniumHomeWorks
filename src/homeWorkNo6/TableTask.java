package homeWorkNo6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableTask {
    public static void main(String[] args) {
        //http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
      //enter user name
       WebElement userId = driver.findElement(By.xpath("//input[@id='txtUsername']"));
       userId.sendKeys("Admin");
       //enter password
      WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
          password.sendKeys("Hum@nhrm123");
          //click login
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        WebElement pimButton=driver.findElement(By.xpath("//b[text()='PIM']"));

        pimButton.click();
        //go through all the elements in column with id
        List<WebElement> id=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for (int i = 0; i <id.size() ; i++) {
            ////table/tbody/tr/td[2]
          String text=  id.get(i).getText();
          if(text.equalsIgnoreCase("46415522"))//
          {
              System.out.println(text);
              System.out.println("List index location : "+i);
              //click the checkbox
              driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]")).click();
              //table/tbody/tr[1]/td[1] 
          }
        }
        
        
        
        
        
    }
}

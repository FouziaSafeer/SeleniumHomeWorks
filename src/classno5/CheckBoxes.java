package classno5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url ="http://practice.syntaxtechs.net/basic-checkbox-demo.php";
        driver.get(url);
       // get all the check boxes
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
            //iterate througyh list


        for (WebElement checkbox:checkBoxes) {
            String value = checkbox.getAttribute("value");
            if (value.equalsIgnoreCase("Option-4"))
            {
                checkbox.click();
            }
        }
        
       /* for (int i = 0; i < checkBoxes.size(); i++) {
           String value= checkBoxes.get(i).getAttribute("value");
           //check if its desire one then click if not then countinue to iterate
            if(value.equalsIgnoreCase("Option-4")){
                checkBoxes.get(i).click();
            }*/
        }

    }


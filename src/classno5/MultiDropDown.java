package classno5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        driver.get(url);
       WebElement dropDown= driver.findElement(By.xpath("//select[@id='multi-select']"));
       Select sel=new Select(dropDown);
       //Select by value
        sel.selectByValue("New Jersey");
        //select by visible text
        sel.selectByVisibleText("Ohio");
        Thread.sleep(2000);
        //when comes to multipledrop we can deselect
        sel.deselectByValue("New Jersey");
        sel.deselectByVisibleText("Ohio");
        System.out.println(  sel.isMultiple());
    }
}
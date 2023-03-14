package classno5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url ="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        driver.get(url);
        //locate the web element
        WebElement dropdown= driver.findElement(By.xpath("//select[@id='select-demo']"));
       //use select class because this tag have select tag
        Select sel=new Select(dropdown);
        //using select class have methods
        Thread.sleep(2000);
       sel.selectByIndex(2);
        //select by value
        Thread.sleep(2000);
        sel.selectByValue("Tuesday");
        //select by visible text
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");


}}

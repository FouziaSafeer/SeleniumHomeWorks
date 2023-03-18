package classNo8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableDynamic {
    public static void main(String[] args) {


        //  tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto syntax projects.com
        //driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
        driver.get(url);
        WebElement userId=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));//.sendKeys("Tester");
        userId.sendKeys("Tester");
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
        WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        //check the text box containg the product screen save
        List<WebElement> column=driver.findElements(By.xpath("//table[@class='SampleTable'] /tbody/tr/td[3]"));
        for (int i = 0; i < column.size(); i++) {
            // extract the text
              String text= column.get(i).getText();
            if( text.equalsIgnoreCase("ScreenSaver")){
                System.out.println(text);
                System.out.println("the screen saver is located in row number : "+ (i+2));
WebElement checkbon=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]"));//dynamic by rows number
               checkbon.click();
                System.out.println("check the check box");////input[@type='checkbox']////table/tbody/tr/td[text()='ScreenSaver']
////table[@class='SampleTable']/tbody/tr/td[1]
                ////table[@class='SampleTable']/tbody/tr[]/td[1]
           }

        }
       // for (WebElement col:column) {

        //}







        //tables1) ststic2)dynamic





    }
}
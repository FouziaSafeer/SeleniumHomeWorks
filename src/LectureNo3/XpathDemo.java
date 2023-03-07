package LectureNo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        /*

in xpath we learned 4 type

a.by attribute    //tagname[@attribute = 'attribute value']
b.by text          //tagname[text() = 'text value']
c.By partial attribute value    //tagname[contains(@attribute, 'partial attribute value')]
d.by partial text value        //tagname[contains(text(), 'partial text value')]*/
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // creat an instance of webdriver
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
       //find username
        WebElement username= driver.findElement(By.xpath("//input[contains(@name,'username')]")); //.sendKeys("fouzia");
        username.sendKeys("tester");
            //fine password
       WebElement usernameText=driver.findElement(By.xpath("//label[contains(text(),'Usernam')]"));
       String s=usernameText.getText();
        System.out.println(s);
       WebElement passwordText= driver.findElement(By.xpath("//label[(text()='Password:')]"));
       String s2=passwordText.getText();
        System.out.println(s2);
      // WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
       // WebElement password=driver.findElement(By.xpath("//input[contains(@name,'password')]")); //.sendKeys("fouzia");
     // password.sendKeys("tester");
        //  driver.findElement(By.xpath("//button[contains(@name,'login_button')]")).click();
        //  ctl00$MainContent$login_button
        // driver.findElement(By.xpath())

       // username.clear();
       // password.clear();
    }
}

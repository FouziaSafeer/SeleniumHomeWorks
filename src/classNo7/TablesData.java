package classNo7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesData {
    public static void main(String[] args) {

        //  tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
    driver.get(url);
        WebElement userId=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));//.sendKeys("Tester");
        userId.sendKeys("Tester");
       WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
       WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        //data from date is fetch Acess level 1 table
        WebElement table=driver.findElement(By.xpath("//table[@class='SampleTable']"));
//data store as strings
        String tabledata=table.getText();
        //data printed
       // System.out.println(tabledata); commet this
        //1)row level access, get row of the table
       List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
       //print the rows
        for (WebElement row:rows) {
            //2)extract text from each text
            String s=row.getText();
            if(s.contains("Bob")) {
              //  System.out.println("-----------------");
               // System.out.println(s);
            }
        }
        //3) company have google. more specific
        //column base access
     List < WebElement> coulms =driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td"));
        for (WebElement col:coulms) {
            String data=col.getText();
          //  System.out.println(data);
           // System.out.print("----------------------");

        }

//task: just print the first column of every
       List<WebElement> firstRow = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2]"));
        for (WebElement col:firstRow) {

           String s= col.getText();
         //  if(s.contains("Bob")){
              // System.out.println(s);
           }

        List<WebElement>row= driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[7]"));
        for (WebElement row2:row)
        {
         String rowdata=  row2.getText();
            System.out.println(rowdata);
        }



        driver.close();
        }











    }


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunachBrowser {


    public static void main(String[] args) throws InterruptedException {


        //tell your project where the webdriver is located.,weeb driver, where that driver is place
        //for mac user please to not use exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // creat an instance of webdriver
        WebDriver driver=new ChromeDriver();
        //open website google.com
        driver.get("https://en-gb.facebook.com/");
        //get the current url
       String URL= driver.getCurrentUrl();
       //Ptint url
        System.out.println(URL);
        //getthe title of webpage
      String title=  driver.getTitle();
        System.out.println(" The title of the page is "+title);
          //close browser
        Thread.sleep(3000);// slow down the clossing down
            driver.quit();
    }
}

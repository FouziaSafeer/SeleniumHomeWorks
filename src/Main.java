import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
    //****************chrome*********************
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.close();
        //**********************Edge***********************
        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe ");
        WebDriver driver1=new EdgeDriver();
        driver1.get("http://www.facebook.com/");
        driver1.close();
        //********************FireFox************************


        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver(); //launch the browser
        driver2.get("https://www.google.com/"); // navigate to the specified url
                driver2.close();
                //*****************opera********
        System.setProperty("webdriver.opera.driver", "Drivers/operadriver.exe");
        WebDriver driver3 = new OperaDriver(); //launch the browser
        driver3.get("https://www.google.com/");
        driver3.manage().window().maximize();
        driver3.close();

    }
}
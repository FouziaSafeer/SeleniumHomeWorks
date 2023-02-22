package homeWorkNo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Task1withChrome {
    /**
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     *///------------------chrome--------------------------
    public static void main(String[] args) throws InterruptedException {
        String url;
        String title;
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();


        chrome.get("https://www.amazon.co.uk");

        url = chrome.getCurrentUrl();
        System.out.println("\n\n"+url);
        title = chrome.getTitle();
        System.out.println(title+"\n\n");
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.close();

        System.out.println("*************************************");


        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver msedge = new EdgeDriver();
        msedge.navigate().to("https://www.amazon.co.uk");
        url = msedge.getCurrentUrl();
        System.out.println("\n\n"+url);
        title = msedge.getTitle();
        System.out.println(title+"\n\n");
        msedge.manage().window().maximize();
        Thread.sleep(2000);
        msedge.quit();
        System.out.println("************************************");

        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver firefox=new FirefoxDriver();
        firefox.get("https://www.amazon.co.uk");
        url= firefox.getCurrentUrl();
        System.out.println("\n"+url);
       title= firefox.getTitle();
        System.out.println(title+"\n\n");
        firefox.manage().window().maximize();
        Thread.sleep(2000);
        firefox.close();

        System.setProperty("webdriver.opera.driver","Drivers/operadriver.exe");
        WebDriver opera=new OperaDriver();
        opera.get("https://www.amazon.co.uk");
        url= opera.getCurrentUrl();
        System.out.println("\n"+url);
        title= opera.getTitle();
        System.out.println(title+"\n\n");
        opera.manage().window().maximize();
        Thread.sleep(2000);
        opera.quit();

    }
}

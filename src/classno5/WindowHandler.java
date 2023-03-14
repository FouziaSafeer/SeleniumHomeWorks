package classno5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandler {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://accounts.google.com/v3/signin/identifier?dsh=S1140868302%3A1678382476227869&continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dgo-to-account-button&ifkv=AWnogHf0L6QsBinqEnbZuKYUDaYOZ1hFuS4qRFgm2epxIyWRDT55n7XDeMG2Bq3fhwuCgDIGd6t1&service=accountsettings&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

        //https://myaccount.google.com/
        driver.get(url);
        //click on the help
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        //click on the privacy button
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
        //get the windows handle of the parent
        String parentWindowsHandle = driver.getWindowHandle();
        System.out.println(parentWindowsHandle);
        //get the handles of the all wingds
        Set<String> windowhandles = driver.getWindowHandles();
        //print  all the windows handles
        for (String wh : windowhandles) {
            System.out.println(wh);
        }



        for (String wh : windowhandles) {
            driver.switchTo().window(wh);

            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) {
                System.out.println("help handler" + wh);
                break;


            }

        }

        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWindowsHandle);
        System.out.println(driver.getTitle());
      /*  for (String wh : windowhandles) {
            driver.switchTo().window(wh);

            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Privacy & Terms – Google")) {
                System.out.println("Privacy" + wh);
                break;


            }


        }*/

    }
}



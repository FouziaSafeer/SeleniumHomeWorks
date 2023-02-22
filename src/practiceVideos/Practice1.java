package practiceVideos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver chromedriver = new ChromeDriver();
        //chromedriver.get("https:www.google.com");
        String path="https://www.google.com/";
        chromedriver.get(path);
        String url=chromedriver.getCurrentUrl();
        System.out.println(url);
        System.out.println(path);
        String title=chromedriver.getTitle();




        if (path.equalsIgnoreCase(url)) {
            System.out.println("We open right url");
        } else  {
            System.out.println("We reach wrong url");
        }

        if (title.equalsIgnoreCase("Google") ) {
            System.out.println("We got correct Title");
        } else {
            System.out.println("wrong title");
        }
        chromedriver.quit();

        // System.out.println(chromedriver.getCurrentUrl());
        //System.out.println(chromedriver.getTitle());
        //chromedriver.quit();


    }
}

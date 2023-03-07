package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Checkedboxes {
    public static <num> void main(String[] args) {
        /*goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
1. u need to write down the code that can select  1 check box out of 4 mentioned,
e.g option1 , option2 , option 3, option 4

Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
Syntax - Website to practice Syntax Automation Platform*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url ="http://practice.syntaxtechs.net/basic-checkbox-demo.php";
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("Please select no of check box 1-4");
        Scanner input=new Scanner(System.in);

        int num = input.nextInt();
        switch ((num)){
            case 1:
                driver.findElement(By.xpath("//input  [@value='Option-1']")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//input  [@value='Option-2']")).click();
                break;
            case 3:
                driver.findElement(By.xpath("//input  [@value='Option-3']")).click();
                break;
            case 4:
                driver.findElement(By.xpath("//input  [@value='Option-4']")).click();


            break;
            default:
                throw new IllegalStateException("Unexpected value: " + (num));
        }


    }
}

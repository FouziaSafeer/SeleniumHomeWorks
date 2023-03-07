package lectureNo4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobotton {
    public static void main(String[] args) {

        //connect driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //iniciate webdrive
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
       // http://practice.syntaxtechs.net/basic-radiobutton-demo.php
       // driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php%22);

//        click on the radio button Male
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));

       boolean isEnableMale= maleBtn.isEnabled();
        System.out.println("the radio button is enable   "+ isEnableMale);
        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("it male radio  button is displayed "+ isDisplayedMale);

        boolean isMaleRadioIsSElected = maleBtn.isSelected();
        System.out.println("is it selected "+isMaleRadioIsSElected);
        if(!isMaleRadioIsSElected) {
            maleBtn.click();
        }
        isMaleRadioIsSElected=maleBtn.isSelected();
        System.out.println("the status is selection  "+ isMaleRadioIsSElected);


    }
}

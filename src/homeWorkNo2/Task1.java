package homeWorkNo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {


    /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
    */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver chrome=new ChromeDriver();
        String url="https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22";
        chrome.get(url);
        chrome.manage().window().maximize();
        chrome.findElement(By.id("customer.firstName") ).sendKeys("Fouzia");//id=
        chrome.findElement(By.id("customer.lastName")).sendKeys("Safeer");//customer.address.street
        chrome.findElement(By.id("customer.address.street")).sendKeys("123 street ");
         chrome.findElement(By.id("customer.address.city")).sendKeys("Birmingham"); //"customer.address.city"
        chrome.findElement(By.id("customer.address.state")).sendKeys("West Midlands");
        chrome.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        chrome.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
        chrome.findElement(By.id("customer.ssn")).sendKeys("987654321");
        chrome.findElement(By.id("customer.username")).sendKeys("Fizzy");
        chrome.findElement(By.id("customer.password")).sendKeys("Cool");
        chrome.findElement(By.id("repeatedPassword")).sendKeys("Cool");
        chrome.findElement(By.className("button")).click();
        Thread.sleep(2000);
        chrome.close();

}}

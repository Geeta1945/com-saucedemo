import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Class {

    public static void main(String[] args) {
        String saucedemoUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(saucedemoUrl);
        driver.manage().window().maximize();
        System.out.println("Title of the page : "+ driver.getTitle());
        System.out.println("Current Url Page : " + driver.getCurrentUrl());// printing the current Url
        System.out.println("Page Source : " + driver.getPageSource());// printing the page source
        WebElement emailField = driver.findElement(By.id("user-name"));// find email field element
        emailField.sendKeys("myhotmail@hotmail.com");// Entering email id
        WebElement emailPassword = driver.findElement(By.name("password"));// find password field element
        emailPassword.sendKeys("enjoy567");// entering password to password field*/

    }
}

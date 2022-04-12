import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Class {
    public static void main(String[] args) {
        String saucedemoUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(saucedemoUrl);
        driver.manage().window().maximize();
        System.out.println("Title of the page : "+ driver.getTitle());
        System.out.println("Current Url Page : " + driver.getCurrentUrl());// printing the current Url
        System.out.println("Page Source : " + driver.getPageSource());// printing the page source
        WebElement emailAddress = driver.findElement(By.id("user-name"));
        emailAddress.sendKeys("myhotmail@hotmail.com");// Entering email id
        WebElement emailPassword = driver.findElement(By.name("password"));// find password field element
        emailPassword.sendKeys("enjoy567");// entering password to password field*/
        driver.close();
    }
}

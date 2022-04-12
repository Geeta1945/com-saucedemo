import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multibrowser_Class {

    static String browser = "firefox";
    static String mainUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox")){

            System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
             driver = new FirefoxDriver();
        }
        else{
            System.out.println("Wrong Browser Name");
        }

        driver.get(mainUrl);
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

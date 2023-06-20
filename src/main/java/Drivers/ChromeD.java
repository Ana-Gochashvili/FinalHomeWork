package Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ChromeD {
    public static WebDriver  driver  = new ChromeDriver();


    @BeforeMethod
    public void runTheDriver(){

        driver.manage().window().maximize();
        driver.get("https://app.loadero.com/");

    }

    @AfterMethod
    public void closeTheDriver(){

        driver.close();

    }

}

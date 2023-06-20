import Drivers.ChromeD;
import RegistationPackage.SignUpSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import static DataPackage.RegistrationData.*;



public class RegistrationTesting extends ChromeD {
    @Test(priority = 1)

    public void registerWithWrongEmail() throws InterruptedException {

        SignUpSteps SignUp = new SignUpSteps(driver);
        SignUp.openRegisterPage();
        SignUp.setUserName(myName);
        SignUp.setUserLasName(mySurname);
        SignUp.setUserEmail(wrongEmail);
        SignUp.setUserPassword(myPassword);
        SignUp.confirmUserPassword(myPassword);
        SignUp.checkBoxOne();
        SignUp.checkBoxTwo();
        SignUp.registerButtonClick();


            WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/div")));

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div")).getText(), "Account already exists");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div")).getCssValue("color"), "rgba(255, 255, 255, 1)");


    }

    @Test(priority = 2)
    public void confirmWithWrongPassword() throws InterruptedException {


        SignUpSteps SignUp = new SignUpSteps(driver);
        SignUp.openRegisterPage();
        SignUp.setUserName(myName);
        SignUp.setUserLasName(mySurname);
        SignUp.setUserEmail(myEmail);
        SignUp.setUserPassword(myPassword);
        SignUp.confirmUserPassword(wrongPassword);
        SignUp.checkBoxOne();
        SignUp.checkBoxTwo();
        SignUp.registerButtonClick();


        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div[5]/div[3]/span")).getText(),"Passwords do not match");
        Assert.assertEquals(driver.findElement(By.className("form-field__label")).getCssValue("color"),"rgba(38, 38, 48, 1)");

        driver.findElement(By.className("password-show-main")).click();

        Assert.assertEquals("Hide", driver.findElement(By.className("form-field__password-view")).getText());

        driver.findElement(By.className("form-field__password-view")).click();

        Assert.assertEquals("Show", driver.findElement(By.className("form-field__password-view")).getText());


    }


}

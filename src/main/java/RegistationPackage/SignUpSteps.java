package  RegistationPackage;
import ElementsPackage.Elements;
import org.openqa.selenium.WebDriver;


public class SignUpSteps extends Elements {
    WebDriver driver;

    public SignUpSteps(WebDriver myDriver){
        driver = myDriver;
    }


    public void openRegisterPage(){
        driver.findElement(registerLink).click();
    }

    public void setUserName(String userName){
        driver.findElement(name).sendKeys(userName);
    }

    public void setUserLasName(String lastName){
        driver.findElement(surName).sendKeys(lastName);
    }

    public void setUserEmail(String mail){
        driver.findElement(email).sendKeys(mail);
    }

    public void setUserPassword(String userPassword){
        driver.findElement(password).sendKeys(userPassword);
    }

    public void confirmUserPassword(String userPassword){
        driver.findElement(passConfirm).sendKeys(userPassword);
    }

    public void checkBoxOne(){
        driver.findElement(checkBoxOne).click();
    }

    public void checkBoxTwo(){
        driver.findElement(checkBoxTwo).click();
    }

    public void registerButtonClick(){
        driver.findElement(registerButton).click();
    }



















}

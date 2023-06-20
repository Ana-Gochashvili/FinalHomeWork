package ElementsPackage;
import org.openqa.selenium.By;


public class Elements {

    protected By
            registerLink = By.linkText("Register"),

            //registerLink = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/a"),

            name = By.id("name"),
            surName = By.name("surname"),
            email = By.id("email"),
            password = By.id("password"),
            passConfirm = By.name("confirmPassword"),
            checkBoxOne = By.id("policy"),
            checkBoxTwo = By.id("consent"),
            registerButton = By.className("button");



















}

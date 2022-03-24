package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import constants.PathResources;

public class RegistrationPage extends Base{
    private By txtRegistrationTitle = By.cssSelector(PathResources.getPATH_TITTLE_REGISTRATION_PAGE());
    private WebDriver driver;

    public RegistrationPage(WebDriver driver){
        super(driver);
    }

    public String getRegistrationPageTitle(){
        WebElement titleRegistrationPage = findElement(txtRegistrationTitle);
        return getText(titleRegistrationPage);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import constants.PathResources;

public class NewsPage extends Base{

    private By txtNewsTitle = By.cssSelector(PathResources.getPATH_TITTLE_NEWS_PAGE());
    private WebDriver driver;

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public String getNewsPageTitle(){
        WebElement newsPageTitle = findElement(txtNewsTitle);
        return getText(newsPageTitle);
    }
}

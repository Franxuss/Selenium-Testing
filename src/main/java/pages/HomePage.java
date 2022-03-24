package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import constants.PathResources;

public class HomePage extends Base{

    private By jobPageButton = By.xpath(PathResources.getJOB_PAGE_BUTTON_PATH());
    private By newsPageButton = By.cssSelector(PathResources.getPATH_NEWS_PAGE());
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToJobPage(){
        click(jobPageButton);
    }

    public void goToNewsPage(){
        click(newsPageButton);
    }


}

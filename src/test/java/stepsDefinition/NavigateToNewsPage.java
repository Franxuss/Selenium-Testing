package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.HomePage;
import pages.NewsPage;
import constants.PathResources;
import java.io.File;
import java.time.Duration;

public class NavigateToNewsPage {

    private static final Logger logger = LoggerFactory.getLogger(NavigateToNewsPage.class);
    private By Cookie = By.xpath(PathResources.getCOOKIE());
    WebDriver driver;
    HomePage homePage;
    NewsPage newsPage;

    @Before("@NewsPage")
    public void setUp(){
        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.visit(PathResources.getURL());
    }

    @Given("we want to go to news page")
    public void we_want_to_go_to_news_page() throws Exception {
        takeScreenShot("Test2-HomePage.png");
        logger.info("Home page in test 2");

        //Aceptamos las cookies
        WebDriverWait waitCookie = new WebDriverWait(driver, Duration.ofSeconds(30));
        waitCookie.until(ExpectedConditions.elementToBeClickable(Cookie)).click();
        logger.info("Accept cookies in test 2");
    }

    @When("we click on news")
    public void we_click_on_news() {
        homePage.goToNewsPage();
        logger.info("Click on news");
    }

    @Then("we navigate to news page")
    public void we_navigate_to_news_page() throws Exception {
        newsPage = new NewsPage(driver);
        takeScreenShot("Test2-NewsPage.png");
        logger.info("Navigate to news page");
        Thread.sleep(3000);
        Assert.assertEquals("NEWS", newsPage.getNewsPageTitle());
        logger.info("Driver closed in test 2");
    }

    @After("@NewsPage")
    public void tearDown(){
        driver.close();
    }

    public void takeScreenShot(String fname) throws Exception {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String imageFileDir = System.getProperty("user.home");
        if (imageFileDir == null) imageFileDir = System.getProperty("java.io.tmpdir");
        FileUtils.copyFile(scrFile, new File(imageFileDir, fname));
    }
}

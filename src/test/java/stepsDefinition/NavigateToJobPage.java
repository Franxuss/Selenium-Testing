package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.RegistrationPage;
import constants.PathResources;
import java.io.File;
import java.time.Duration;

public class NavigateToJobPage {

    private static final Logger logger = LoggerFactory.getLogger(NavigateToJobPage.class);
    private By Cookie = By.xpath(PathResources.getCOOKIE());
    WebDriver driver;
    HomePage homePage;
    RegistrationPage registrationPage;

    @Before("@JobPage")
    public void setUp(){
        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.visit(PathResources.getURL());
    }

    @Given("we want to go to job registration")
    public void we_want_to_go_to_job_registration() throws Exception {
        takeScreenShot("Test1-HomePage.png");
        logger.info("Home page in test 1");

        //Aceptamos las cookies
        WebDriverWait waitCookie = new WebDriverWait(driver, Duration.ofSeconds(30));
        waitCookie.until(ExpectedConditions.elementToBeClickable(Cookie)).click();
        logger.info("Accept cookies in test 1");
    }

    @When("we click on send us your cv")
    public void we_click_on_send_us_your_cv() {
        homePage.goToJobPage();
        logger.info("Click on job button");
    }

    @Then("the registration page will be opened")
    public void the_registration_page_will_be_opened() throws Exception {
        registrationPage = new RegistrationPage(driver);
        takeScreenShot("Test1-JobPage.png");
        logger.info("Navigate to job registration page");
        Thread.sleep(3000);
        Assert.assertEquals("INSCRÍBETE DIRECTAMENTE", registrationPage.getRegistrationPageTitle());
        logger.info("Driver closed in test 1");
    }

    @After("@JobPage")
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

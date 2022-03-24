package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import constants.PathResources;

public class Base {

    private WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty(PathResources.getTYPE_DRIVER(), PathResources.getPATH_DRIVER());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void visit(String url) {
        driver.get(url);
    }
}

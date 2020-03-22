package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public abstract class BasePage {
    protected WebDriver driver;
    public static final String TITLE = "My Store";
    private static final By mainLogoXpath = By.xpath(("//a[@title='My Store']"));

    protected void waitPageIsLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(mainLogoXpath));
    }
    protected void assertPageIsOpened(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }
    protected void clickOnClickableElement(By locator) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }
}

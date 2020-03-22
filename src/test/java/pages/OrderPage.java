package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class OrderPage extends BasePage {
    public static final String PAGE_TITLE = "Order - " + TITLE;
    private final By proceedButtonOnOrderPage = By.xpath("//p/a[@title='Proceed to checkout']");

    public OrderPage(WebDriver driver) {
        super.driver = driver;
        waitPageIsLoaded();
    }
    public void assertOrderPageIsOpened() {
        assertPageIsOpened(PAGE_TITLE);
    }
    public void clickProceedButtonOnOrderPage() {
        clickOnClickableElement(proceedButtonOnOrderPage);
    }
}

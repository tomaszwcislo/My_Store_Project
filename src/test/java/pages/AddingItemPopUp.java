package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddingItemPopUp extends BasePage {
    private static final String successfulAddingMessage = "Product successfully added to your shopping cart";
    private final By addingMessageXpath = By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']/h2");
    private final By proceedButton = By.xpath("//a[@title='Proceed to checkout']");

    public AddingItemPopUp(WebDriver driver) {
        super.driver = driver;
    }
    public void waitPopUpIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addingMessageXpath));
    }
    public void assertSuccessfulAddingItem() {
        WebElement addingMessage = driver.findElement(addingMessageXpath);
        Assert.assertEquals(addingMessage.getText(), successfulAddingMessage);
    }
    public void clickProceedButton() {
        clickOnClickableElement(proceedButton);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class OrderConfirmationPage extends BasePage {
    private static final String orderConfirmationPageText = "Order confirmation";
    private final By orderConfirmationPageTextXpath = By.xpath("//span[@class='navigation_page']");
    private static final String orderConfirmationMessageText = "Your order on My Store is complete.";
    private final By orderConfirmationMessageXpath = By.xpath("//p[@class='cheque-indent']");
    private final By clickOnLogOutButton = By.xpath("//a[@class='logout']");

    public OrderConfirmationPage(WebDriver driver) {
        super.driver = driver;
    }
    public void assertOrderConfirmationPageIsOpened() {
        WebElement addressText = driver.findElement(orderConfirmationPageTextXpath);
        Assert.assertEquals(addressText.getText(), orderConfirmationPageText);
    }
    public void assertOrderConfirmationMessageIsDisplayed() {
        WebElement addressText = driver.findElement(orderConfirmationMessageXpath);
        Assert.assertEquals(addressText.getText(), orderConfirmationMessageText);
    }
    public void clickOnLogOut() {
        driver.findElement(clickOnLogOutButton).click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ConfirmationPage extends BasePage {
    private static final String confirmationPageText = "Bank-wire payment.";
    private final By confirmationPageTextXpath = By.xpath("//span[@class='navigation_page']");
    private final By clickOnConfirmButton = By.xpath("//p[@id='cart_navigation']/button");

    public ConfirmationPage(WebDriver driver) {
        super.driver = driver;
    }
    public void assertConfirmationPageIsOpened() {
        WebElement addressText = driver.findElement(confirmationPageTextXpath);
        Assert.assertEquals(addressText.getText(), confirmationPageText);
    }
    public void clickOnConfirmationButton() {
        driver.findElement(clickOnConfirmButton).click();
    }
}

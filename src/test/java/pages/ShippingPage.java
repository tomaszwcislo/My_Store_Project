package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ShippingPage extends BasePage {
    private static final String shippingPageText = "Shipping";
    private final By shippingPageTextXpath = By.xpath("//span[@class='navigation_page']");
    private final By clickOnAgreeTerms = By.xpath("//input[@id='cgv']");
    private final By proceedButtonOnShippingPage = By.xpath("//button[@name='processCarrier']");

    public ShippingPage(WebDriver driver) {
        super.driver = driver;
    }
    public void assertShippingPageIsOpened() {
        WebElement addressText = driver.findElement(shippingPageTextXpath);
        Assert.assertEquals(addressText.getText(), shippingPageText);
    }
    public void clickOnAgreeTermsBox() {
        driver.findElement(clickOnAgreeTerms).click();
    }
    public void clickProceedButtonOnAddressPage() {
        clickOnClickableElement(proceedButtonOnShippingPage);
    }

}

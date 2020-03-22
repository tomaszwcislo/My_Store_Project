package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddressPage extends BasePage {
    private static final String addressPageText = "Addresses";
    private final By addressPageTextXpath = By.xpath("//span[@class='navigation_page']");
    private final By proceedButtonOnAddressPage = By.xpath("//button[@name='processAddress']");

    public AddressPage(WebDriver driver) {
        super.driver = driver;
    }
    public void assertAddressPageIsOpened() {
        WebElement addressText = driver.findElement(addressPageTextXpath);
        Assert.assertEquals(addressText.getText(), addressPageText);
    }
    public void clickProceedButtonOnAddressPage() {
        clickOnClickableElement(proceedButtonOnAddressPage);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AuthenticationPage extends BasePage {
    private static final String authenticationPageText = "Authentication";
    private final By authenticationPageTextXpath = By.xpath("//span[@class='navigation_page']");

    public AuthenticationPage(WebDriver driver) {
        super.driver = driver;
    }
    public void assertUserIsLoggedOut() {
        WebElement addressText = driver.findElement(authenticationPageTextXpath);
        Assert.assertEquals(addressText.getText(), authenticationPageText);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends BasePage {
    private final By homePageFirstItem = By.xpath("//ul[@id='homefeatured']/li//a[@title='Add to cart' and @data-id-product='1']");

    public HomePage(WebDriver driver) {
        super.driver = driver;
    }
    public void clickOnAddToCartFirstItem() {
        clickOnClickableElement(homePageFirstItem);
    }
}
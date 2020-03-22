package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PaymentPage extends BasePage {
        private static final String paymentPageText = "Your payment method";
        private final By paymentPageTextXpath = By.xpath("//span[@class='navigation_page']");
        private final By clickOnPayByBankWire = By.xpath("//a[@class='bankwire']");

        public PaymentPage(WebDriver driver) {
            super.driver = driver;
        }
        public void assertPaymentPageIsOpened() {
            WebElement addressText = driver.findElement(paymentPageTextXpath);
            Assert.assertEquals(addressText.getText(), paymentPageText);
        }
        public void clickOnPayByBanWireBox() {
            driver.findElement(clickOnPayByBankWire).click();
        }
}

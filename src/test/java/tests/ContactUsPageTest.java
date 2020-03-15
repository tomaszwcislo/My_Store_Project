package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ContactUsPage;

public class ContactUsPageTest extends BaseTestClass {

    @Test
    public void ContactUsTest() {
        driver.navigate().to("http://automationpractice.com/index.php");
        Assert.assertEquals(driver.getTitle(), "My Store");

        HomePage.contactUsLink(driver).click();
        Assert.assertEquals(driver.getTitle(), "Contact us - My Store");

        driver.navigate().to("http://automationpractice.com/index.php?controller=contact");
        ContactUsPage.textBox(driver).sendKeys("Hello, what's Up?");

        Select subjectHeading = new Select(ContactUsPage.subjectMessage(driver));
        subjectHeading.selectByVisibleText("Customer service");

        ContactUsPage.emailBox(driver).sendKeys("tomaszwcislo@hotmail.com");

        ContactUsPage.submitButton(driver).click();

        String expectedSuccessMessage = "Your message has been successfully sent to our team.";
        Assert.assertEquals(ContactUsPage.successMessage(driver).getText(), expectedSuccessMessage);
    }
}

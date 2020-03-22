package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage extends BasePage {
    public static final String PAGE_TITLE = "Login - " + TITLE;
    private final By emailField = By.xpath("//input[@id='email']");
    private final By passwordField = By.xpath("//input[@id='passwd']");
    private final By signInButton = By.xpath("//button[@id='SubmitLogin']");

    public LoginPage(WebDriver driver) {
        super.driver = driver;
        waitPageIsLoaded();
    }
    public void assertLoginPageIsOpened() {
        assertPageIsOpened(PAGE_TITLE);
    }
    public void fillEmailField() {
        WebElement emailAddress = driver.findElement(emailField);
        emailAddress.sendKeys("tomaszwcislo@hotmail.com");
    }
    public void fillPasswordField() {
        WebElement emailAddress = driver.findElement(passwordField);
        emailAddress.sendKeys("123456789");
    }
    public void clickSignInButtonOnLoginPage() {
        clickOnClickableElement(signInButton);
    }
}

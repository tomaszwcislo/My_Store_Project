package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

    public static WebElement textBox(WebDriver driver) {
        return driver.findElement(By.id("message"));
    }

    public static WebElement subjectMessage(WebDriver driver) {
        return driver.findElement(By.id("id_contact"));
    }

    public static WebElement emailBox(WebDriver driver) {
        return driver.findElement(By.id("email"));
    }

    public static WebElement submitButton(WebDriver driver) {
        return driver.findElement(By.id("submitMessage"));
    }

    public static WebElement successMessage(WebDriver driver) {
        return driver.findElement(By.xpath("//p[@class='alert alert-success']"));
    }
}

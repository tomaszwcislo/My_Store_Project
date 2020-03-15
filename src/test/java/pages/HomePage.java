package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {

    public static WebElement contactUsLink(WebDriver driver) {
        return driver.findElement(By.xpath("//div[@id='contact-link']/a"));
    }
}
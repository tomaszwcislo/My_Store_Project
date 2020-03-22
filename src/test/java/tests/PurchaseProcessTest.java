package tests;

import org.testng.annotations.Test;
import pages.*;

public class PurchaseProcessTest extends BaseTest {
    @Test
    public void purchasingAllPathTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnAddToCartFirstItem();

        AddingItemPopUp addingItemPopUp = new AddingItemPopUp(driver);
        addingItemPopUp.waitPopUpIsDisplayed();
        addingItemPopUp.assertSuccessfulAddingItem();
        addingItemPopUp.clickProceedButton();

        OrderPage orderPage = new OrderPage(driver);
        orderPage.assertOrderPageIsOpened();
        orderPage.clickProceedButtonOnOrderPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.assertLoginPageIsOpened();
        loginPage.fillEmailField();
        loginPage.fillPasswordField();
        loginPage.clickSignInButtonOnLoginPage();

        AddressPage addressPage = new AddressPage(driver);
        addressPage.assertAddressPageIsOpened();
        addressPage.clickProceedButtonOnAddressPage();

        ShippingPage shippingPage = new ShippingPage(driver);
        shippingPage.assertShippingPageIsOpened();
        shippingPage.clickOnAgreeTermsBox();
        shippingPage.clickProceedButtonOnAddressPage();

        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.assertPaymentPageIsOpened();
        paymentPage.clickOnPayByBanWireBox();

        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        confirmationPage.assertConfirmationPageIsOpened();
        confirmationPage.clickOnConfirmationButton();

        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
        orderConfirmationPage.assertOrderConfirmationPageIsOpened();
        orderConfirmationPage.assertOrderConfirmationMessageIsDisplayed();

        orderConfirmationPage.clickOnLogOut();
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.assertUserIsLoggedOut();
    }
}

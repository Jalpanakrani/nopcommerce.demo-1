package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.RegisterresultPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterresultPage registerresultPage = new RegisterresultPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPage() {
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = homePage.getregisterText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
    @Test
    public void verifyUserShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        registerPage.clickOngenderRadioButton();
        registerPage.enterFirstname("Nakrani");
        registerPage.enterlastname("Jalpa");
        registerPage.enterEmailId("NakraniJalpa123@gmail.com");
        registerPage.enterPassword("jalpa123");
        registerPage.enterconfirmPassword("jalpa123");
        registerPage.enterDay("30");
        registerPage.enterMonth("november");
        registerPage.enterYear("1987");
        String expectedMessage = "Your registration completed";
        String actualMessage = registerresultPage.getYourregistrationcompletedText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }
    }

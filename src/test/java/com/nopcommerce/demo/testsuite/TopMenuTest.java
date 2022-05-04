package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputerButton();
        String expectedMessage = "Computers";
        String actualMessage = homePage.getComputersText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        homePage.clickOnElectronicsButton();
        String expectedMessage = "Electronics";
        String actualMessage = homePage.getElectronicsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        homePage.clickOnApparelButton();
        String expectedMessage = "Apparel";
        String actualMessage = homePage.getApparelText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @Test
    public void userShouldNavigateToDigitaldownloadsPageSuccessfully() {
        homePage.clickOnDigitaldownloadsButton();
        String expectedMessage = "Digital downloads";
        String actualMessage = homePage.getDigitaldownloadsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        homePage.clickOnBookssButton();
        String expectedMessage = "Books";
        String actualMessage = homePage.getbooksText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        homePage.clickOnJewelryButton();
        String expectedMessage = "Jewelry";
        String actualMessage = homePage.getJewelryText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }
}
package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;


public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By registerTax = By.linkText("Register");
    By Computer = By.linkText("Computers");
    By ComputersText = By.linkText("Computers");
    By Electronics = By.linkText("Electronics");
    By ElectronicsText = By.linkText("Electronics");
    By Apparel = By.linkText("Apparel");
    By ApparelText = By.linkText("Apparel");
    By Digitaldownloads = By.linkText("Digital downloads");
    By DigitaldownloadsText = By.linkText("Digital downloads");
    By Books = By.linkText("Books");
    By BooksText = By.linkText("Books");
    By Jewelry = By.linkText("Jewelry");
    By JewelryText = By.linkText("Jewelry");


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public String getregisterText() {
        return getTextFromElement(registerTax);
    }
    public void clickOnComputerButton() {
        clickOnElement(Computer);
    }

    public String getComputersText() {
        return getTextFromElement(ComputersText);
    }

    public String getApparelText() {
        return getTextFromElement(ApparelText);
    }

    public void clickOnApparelButton() {
        clickOnElement(Apparel);

    }

    public String getElectronicsText() {
        return getTextFromElement(ElectronicsText);
    }

    public void clickOnElectronicsButton() {
        clickOnElement(Electronics);
    }

    public String getDigitaldownloadsText() {
        return getTextFromElement(DigitaldownloadsText);
    }

    public void clickOnDigitaldownloadsButton() {
        clickOnElement(Digitaldownloads);
    }

    public String getbooksText() {
        return getTextFromElement(BooksText);
    }

    public void clickOnBookssButton() {
        clickOnElement(Books);

    }

    public String getJewelryText() {
        return getTextFromElement(JewelryText);
    }

    public void clickOnJewelryButton() {
        clickOnElement(Jewelry);
    }
}




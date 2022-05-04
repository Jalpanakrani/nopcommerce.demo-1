package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterresultPage extends Utility {

    By YourregistrationcompletedText = By.xpath("//div[@class='result']");

    public String getYourregistrationcompletedText() {
        return getTextFromElement(YourregistrationcompletedText);

    }
}
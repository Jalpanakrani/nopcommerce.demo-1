package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By genderRadioButton = By.id("gender-female");
    By firstnameField =By.id("FirstName");
    By lastnameField =By.id("LastName");
    By DayField = By.name("DateOfBirthDay");
    By MonthField =By.name("DateOfBirthMonth");
    By YearField = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");


    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
    public void enterconfirmPassword(String password){
        sendTextToElement(confirmPasswordField, password);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

    public void clickOngenderRadioButton(){
        clickOnElement(genderRadioButton);
    }

    public void enterFirstname(String firstname){
        sendTextToElement(firstnameField,firstname);
    }
    public void enterlastname(String firstname){
        sendTextToElement(lastnameField,firstname);

    }
    public void enterDay(String Day) {
        sendTextToElement(DayField, Day);
    }
    public void enterMonth(String Month) {
        sendTextToElement(MonthField, Month);
    }
    public void enterYear(String Year){
        sendTextToElement(YearField,Year);



    }}
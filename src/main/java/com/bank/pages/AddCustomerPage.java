package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    public AddCustomerPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    public void addFirstName(String FirstName){
sendTextToElement(firstName,FirstName);
    }

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    public void addLastName(String LastName){
        sendTextToElement(lastName,LastName);
    }

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;
    public void addPstCode(String PostCode){
        sendTextToElement(postCode,PostCode);
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement addButton;
    public void clickOnaddButton(){
        clickOnElement(addButton);
    }

    public void acceptAlertOnXyzBank(){
        acceptAlert();
    }
}

package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage(){
        PageFactory.initElements(driver,this);
    }


@FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourName;
    public void selectYourNameFromDropDownByValue(String value){
        selectByValueFromDropDown(yourName,value);
    }
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameText;
    public void verifyYourNameText(){
        String actualText = getTextFromElement(yourNameText);
        String expectedText = "Your Name :";
        Assert.assertEquals(actualText,expectedText);
    }

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement logIn;

    public void clickOnLogIn(){
        clickOnElement(logIn);
    }


}

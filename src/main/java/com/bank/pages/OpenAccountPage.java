package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {
    public OpenAccountPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//select[@id='userSelect']")
    WebElement customerNameField;
    public void selectCustomerByDropDown(String text){
       selectByVisibleTextFromDropDown(customerNameField,text);
    }

    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;
    public void selectCurrencyByDropDown(String Currency){
        selectByVisibleTextFromDropDown(currency,Currency);
    }

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement process;

    public void clickOnProcessButton(){
        clickOnElement(process);
    }
}

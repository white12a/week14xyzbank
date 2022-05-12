package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogIn;
    public void clickOnCustomerLogIn(){
        clickOnElement(customerLogIn);
    }


    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankmanagerLogIn;
    public void clickOnBankManagerLogIn(){
        clickOnElement(bankmanagerLogIn);
    }

}

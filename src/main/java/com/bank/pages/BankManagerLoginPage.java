package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;
    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomer);

    }

    @FindBy (xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccount;
    public void clickOnOpenAccountTab(){
        clickOnElement(openAccount);
    }

    @FindBy (xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customers;
    public void clickOnCustomerTab(){
        clickOnElement(customers);
    }
}

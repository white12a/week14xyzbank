package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends Utility {
    public CustomersPage(){
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/button[2]")
    WebElement logOut;
public void verifyLogOutTabIsPresent(){
    verifyThatElementIsDisplayed(logOut);
}
public void clickOnLogOut(){
    clickOnElement(logOut);
}

}

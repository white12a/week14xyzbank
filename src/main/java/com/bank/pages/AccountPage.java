package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//store Transaction, deposit and withdraw.
public class AccountPage extends Utility {
    public AccountPage(){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")
    WebElement transactions;
    public void clickOnTransactions(){
clickOnElement(transactions);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement depositheader;
    public void clickOnDeposit(){
clickOnElement(depositheader);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdrawl;
    public void clickOnWithdrawl(){
clickOnElement(withdrawl);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amountToBeDepositedField;
    public void enterAmountOnAmountField(String amount){
        sendTextToElement(amountToBeDepositedField,amount);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositANdWithdrawlButton;
    public void clickOnDepositAndWithdrawlButton(){
        clickOnElement(depositANdWithdrawlButton);
    }

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessfulAndWithdrawlSucessfulText;
    public void verifyDeoisitSuccessfulText(){
        String actualText = getTextFromElement(depositSuccessfulAndWithdrawlSucessfulText);
        String expectedText = "Deposit Successful";
        Assert.assertEquals(actualText,expectedText);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amountToBeWithdrawl;
    public void enterAmountOnWithdrawlAmountField(String amount){
        sendTextToElement(amountToBeWithdrawl,amount);
    }
    public void verifyWithdrawlSuccessfulText(){
        String actualText = getTextFromElement(depositSuccessfulAndWithdrawlSucessfulText);
        String expectedText = "Transaction Successful";
        Assert.assertEquals(actualText,expectedText);
    }
}

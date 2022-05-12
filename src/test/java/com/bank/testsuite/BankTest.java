package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class BankTest extends TestBase {
    AccountPage accountPage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    HomePage homePage;
    OpenAccountPage openAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        accountPage = new AccountPage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customerLoginPage =  new CustomerLoginPage();
        customersPage = new CustomersPage();
        homePage = new HomePage();
        openAccountPage = new OpenAccountPage();
    }
@Test(dataProvider = "credentials",dataProviderClass = TestData.class,groups = {"sanity","regression"})
 public void   bankManagerShouldAddCustomerSuccessfully(@Optional String FirstName, @Optional String LastName, @Optional String PostCode){

//     click On "Bank Manager Login" Tab
     homePage.clickOnBankManagerLogIn();
//     click On "Add Customer" Tab
     bankManagerLoginPage.clickOnAddCustomerTab();
//     enter FirstName
addCustomerPage.addFirstName(FirstName);
//     enter LastName
     addCustomerPage.addLastName(LastName);
//     enter PostCode
     addCustomerPage.addPstCode(PostCode);
//     click On "Add Customer" Button
    addCustomerPage.clickOnaddButton();
//     popup display
    switchToAlert();
//     verify message "Customer added successfully"
    String actualText =  getTextFromAlert();
    String finalText = actualText.substring(0,27);
    String expectedText = "Customer added successfully";
    Assert.assertEquals(finalText,expectedText);
//     click on "ok" button on popup.
    addCustomerPage.acceptAlertOnXyzBank();

 }
 @Test(groups = {"sanity","smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully(){
//        click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogIn();
//        click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccountTab();
//        Search customer that created in first test
        openAccountPage.selectCustomerByDropDown("Harry Potter");
//        Select currency "Pound"
        openAccountPage.selectCurrencyByDropDown("Pound");
//        click on "process" button
        openAccountPage.clickOnProcessButton();
//        popup displayed
     switchToAlert();
//        verify message "Account created successfully"
     String actualText =  getTextFromAlert();
     String finalText = actualText.substring(0,28);
     String expectedText = "Account created successfully";
     Assert.assertEquals(finalText,expectedText);
//        click on "ok" button on popup.
        addCustomerPage.acceptAlertOnXyzBank();
    }
    @Test(groups = {"smoke","regression"})
public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
//    click on "Customer Login" Tab
    homePage.clickOnCustomerLogIn();
//    search customer that you created.
customerLoginPage.selectYourNameFromDropDownByValue("2");
//    click on "Login" Button
    customerLoginPage.clickOnLogIn();
//    verify "Logout" Tab displayed.
    customersPage.verifyLogOutTabIsPresent();
//    click on "Logout"
        Thread.sleep(2000);
        customersPage.clickOnLogOut();
//    verify "Your Name" text displayed.
        customerLoginPage.verifyYourNameText();
}
@Test(groups = {"smoke","regression"})
public void customerShouldDepositMoneySuccessfully(){
//    click on "Customer Login" Tab
    homePage.clickOnCustomerLogIn();
//    search customer that you created.
customerLoginPage.selectYourNameFromDropDownByValue("2");
//    click on "Login" Button
    customerLoginPage.clickOnLogIn();
//    click on "Deposit" Tab
    accountPage.clickOnDeposit();
//    Enter amount 100
    accountPage.enterAmountOnAmountField("1000");
//    click on "Deposit" Button
    accountPage.clickOnDepositAndWithdrawlButton();
//    verify message "Deposit Successful"
    accountPage.verifyDeoisitSuccessfulText();
}
@Test(groups = {"regression"})
public void customerShouldWithdrawMoneySuccessfully(){
//    click on "Customer Login" Tab
    homePage.clickOnCustomerLogIn();
//    search customer that you created.
    customerLoginPage.selectYourNameFromDropDownByValue("2");
//     click on "Login" Button
    customerLoginPage.clickOnLogIn();
//    click on "Withdrawl" Tab
    accountPage.clickOnWithdrawl();
//    Enter amount 50
 accountPage.enterAmountOnWithdrawlAmountField("100");
//    click on "Withdraw" Button
   accountPage.clickOnDepositAndWithdrawlButton();
//    verify message "Transaction Successful"
    accountPage.verifyWithdrawlSuccessfulText();
}
}

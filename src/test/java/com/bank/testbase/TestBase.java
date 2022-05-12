package com.bank.testbase;


import com.bank.propertyreader.PropertyReader;
import com.bank.utility.Utility;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Jay Vaghani
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown(){
//        closeBrowser();
//    }
}

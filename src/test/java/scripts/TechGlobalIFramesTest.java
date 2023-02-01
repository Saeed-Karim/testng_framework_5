package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalIFramesPage;
import utilities.Waiter;

public class TechGlobalIFramesTest extends TechGlobalBase{

    /**
     * Go to https://techglobal-training.netlify.app/
     * Click on “Practices” dropdown in the header
     * Select the “Frontend Testing” option
     * Click on the “IFrames” card
     * Validate the “Please fill out your information below” text
     */

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalIFramesPage = new TechGlobalIFramesPage();
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("IFrames");
    }

    @Test(priority = 1, description = "Validating inout header  text")
    public void validateInputText(){

        driver.switchTo().frame(techGlobalIFramesPage.iFrameId);
        Assert.assertTrue(techGlobalIFramesPage.inputHeader.isDisplayed());
        Assert.assertEquals(techGlobalIFramesPage.inputHeader.getText(), "Please fill out your information below");
        Waiter.pause(3);
    }

    /**
     * Go to https://techglobal-training.netlify.app/
     * Click on “Practices” dropdown in the header
     * Select the “Frontend Testing” option
     * Click on the “IFrames” card
     * Enter “John” to first name input box
     * Enter “Doe” to last name input box
     * Click on “SUBMIT” button
     * Validate the result equals “You entered: John Doe”
     */

    @Test(priority = 2, description = "Validate Result")
    public void validateResult(){

        driver.switchTo().frame(techGlobalIFramesPage.iFrameId);

        String[] credentials = {"John", "Doe"};

        for (int i = 0; i < credentials.length; i++) {
            techGlobalIFramesPage.inputFields.get(i).sendKeys(credentials[i]);
        }
        techGlobalIFramesPage.submitButton.click();

       // driver.switchTo().parentFrame();
                // or
        driver.switchTo().defaultContent();

        Assert.assertEquals(techGlobalIFramesPage.resultText.getText(),"You entered: " + credentials[0] + " " + credentials[1]);



    }
}





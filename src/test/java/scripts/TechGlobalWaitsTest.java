package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalWaitsPage;
import utilities.Waiter;

public class TechGlobalWaitsTest extends TechGlobalBase {

    /**
     * Go to https://techglobal-training.netlify.app/
     * Click on "Practices" dropdown in the header
     * Select the "Frontend Testing" option
     * Click on the "Waits" card
     * Click on "Click on me to see a red box" button
     * Validate a red box is displayed
     */

    @BeforeMethod
    public void setPage() {
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalWaitsPage = new TechGlobalWaitsPage();
    }


    @Test(priority = 1, description = "Validate red box is visible")
    public void validateRedBox() {
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(3);

        techGlobalWaitsPage.redBoxButton.click();
        Assert.assertTrue(techGlobalWaitsPage.redBoxButton.isDisplayed());
        Waiter.pause(13);




    }


    /**
     * Go to https://techglobal-training.netlify.app/
     * Click on "Practices" dropdown in the header
     * Select the "Frontend Testing" option
     * Click on the "Waits" card
     * Click on "Click on me to see a red box" button
     * Validate a blue box is displayed
     */

    @Test(priority = 2, description = "Validate blue box is visible")
    public void validateBlueBox() {
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(3);

        techGlobalWaitsPage.blueBoxButton.click();
        Assert.assertTrue(techGlobalWaitsPage.blueBoxButton.isDisplayed());

        Waiter.waitForVisibilityOfElement(techGlobalWaitsPage.blueBox, 60);
        Assert.assertTrue(techGlobalWaitsPage.blueBox.isDisplayed());




    }
}
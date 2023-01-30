package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitedAirlinesTestCases extends UnitedAirlinesBaseTest{

    @Test(priority = 1)
    public void validateMainMenuItems(){
        String[] headers = {"BOOK", "MY TRIPS", "TRAVEL INFO", "MILEAGEPLUS® PROGRAM", "DEALS", "HELP"};

        for (int i = 0; i < headers.length; i++) {
            Assert.assertTrue(unitedAirlinesBasePage.headerOptions.get(i).isDisplayed());
            Assert.assertEquals(unitedAirlinesBasePage.headerOptions.get(i).getText(), headers[i]);
        }
    }

    @Test(priority = 2)
    public void validateBookTravelMenu(){
        String[] bookOptions = {"Book", "Flight status", "Check-in", "My trips"};

        for (int i = 0; i < bookOptions.length; i++) {
            Assert.assertTrue(unitedAirlinesBasePage.bookHeaders.get(i).isDisplayed());
            Assert.assertEquals(unitedAirlinesBasePage.bookHeaders.get(i).getText(), bookOptions[i]);
        }
    }

    @Test(priority = 3)
    public void validateRadioButtons(){
        for (int i = 0; i < unitedAirlinesBasePage.roundTripButton.size(); i++) {
            Assert.assertTrue(unitedAirlinesBasePage.roundTripLabel.get(i).isDisplayed());
            Assert.assertTrue(unitedAirlinesBasePage.roundTripLabel.get(i).isEnabled());
            Assert.assertTrue(unitedAirlinesBasePage.roundTripButton.get(i).isSelected());
        }

        for (int i = 0; i < unitedAirlinesBasePage.oneWayButton.size(); i++) {
            Assert.assertTrue(unitedAirlinesBasePage.oneWayLabel.get(i).isDisplayed());
            Assert.assertTrue(unitedAirlinesBasePage.oneWayLabel.get(i).isEnabled());
            Assert.assertFalse(unitedAirlinesBasePage.oneWayButton.get(i).isSelected());
        }

        unitedAirlinesBasePage.oneWayLabel.get(0).click();
        Assert.assertFalse(unitedAirlinesBasePage.roundTripButton.get(0).isSelected());
    }
}
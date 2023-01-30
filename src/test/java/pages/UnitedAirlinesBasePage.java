package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UnitedAirlinesBasePage {

    public UnitedAirlinesBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "a[id*='headerNav']")
    public List<WebElement> headerOptions;

    @FindBy (css = "ul[class*=bookTravel] h2")
    public List<WebElement> bookHeaders;

    @FindBy(css = "label[for*='roundtrip']")
    public List<WebElement> roundTripLabel;

    @FindBy(id = "roundtrip")
    public List<WebElement> roundTripButton;

    @FindBy(css = "label[for*='oneway']")
    public List<WebElement> oneWayLabel;

    @FindBy(id = "oneway")
    public List<WebElement> oneWayButton;
}
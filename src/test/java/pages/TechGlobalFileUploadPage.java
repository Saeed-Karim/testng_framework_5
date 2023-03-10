package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TechGlobalFileUploadPage extends TechGlobalBasePage{

    public TechGlobalFileUploadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
         // or
            // super();
    }

    @FindBy(id = "file_upload")
    public WebElement fileUploadInput;

    @FindBy(id = "file_submit")
    public WebElement uploadButton;

    @FindBy(id = "result")
    public WebElement resultText;
}

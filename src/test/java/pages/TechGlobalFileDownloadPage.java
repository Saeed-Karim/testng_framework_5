package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TechGlobalFileDownloadPage extends TechGlobalBasePage{

    public TechGlobalFileDownloadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
        // or
        // super();
    }

    @FindBy(id = "file_download")
    public WebElement fileDownloadInput;


}



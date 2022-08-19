package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {



    public WebUniversityPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }


    @FindBy(xpath = "(//div[@class='section-title'])[2]")
    public WebElement webUniversityLoginPortal;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement webUniversityUserNameButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement webUniversityPasswordButton;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement webUniversityButton;


}

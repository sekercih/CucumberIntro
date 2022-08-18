package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {

    public HMCPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@href='/Account/Logon']")
    public WebElement mainPageLogin;

    @FindBy(id="UserName")
    public WebElement usernameTextBox;

    @FindBy(id="Password")
    public WebElement passwordTextBox;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;


}

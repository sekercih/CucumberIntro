package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class N11Page {

    public N11Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class=\"btn baseBtn-green\"]")
    public WebElement anapop;

    @FindBy(xpath = "//button[@class=\"dn-slide-deny-btn\"]")
    public WebElement dahaSonra;

    @FindBy(className = "btnSignIn")
    public WebElement giris;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(id = "loginButton")
    public WebElement loginClick;

    @FindBy(xpath = "//*[.=\"FC\"]")
    public WebElement hesapisim;

    @FindBy(id = "searchData")
    public WebElement aramakutusu;

    @FindBy(tagName = "h1")
    public WebElement arananSonuc;

    @FindBy(xpath = "//*[text()=\"2\"]")
    public WebElement ikinciSayfa;
    @FindBy(xpath = "(//*[@class=\"followBtn\"])[3]")
    public WebElement favoriAl;

    @FindBy(linkText = "Favorilerim / Listelerim")
    public WebElement favoriHesap;

      @FindBy(className = "accTitle")
      public WebElement favoriDogrulama;

    @FindBy(className = "listItemTitle")
    public WebElement favoriListesi;

    @FindBy(className = "deleteProFromFavorites")
    public WebElement favoriSil;

    @FindBy(xpath = "//*[text()=\"Ürününüz listeden silindi.\"]")
    public WebElement silmeMesaj;

    @FindBy(xpath = "//*[text()='Tamam']")
    public WebElement silMesajTamam;

    @FindBy(xpath = "//a[@title=\"Çıkış Yap\"]")
    public WebElement cikisYap;


}

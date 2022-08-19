package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigurationReader;

public class HotelMyCampStepDefinations {
HMCPage hmcPage=new HMCPage();

    @Then("login linkine tiklar")
    public void login_linkine_tiklar() {
hmcPage.mainPageLogin.click();
    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String user) {
hmcPage.usernameTextBox.sendKeys(ConfigurationReader.getProperty(user));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
hmcPage.passwordTextBox.sendKeys(ConfigurationReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu.click();

    }
    @When("basarili olarak giris yaptigini test eder")
    public void basarili_olarak_giris_yaptigini_test_eder() {
        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isDisplayed());
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isDisplayed());
    }

    @And("password olarak {string} girmeli")
    public void passwordOlarakGirmeli(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }

    @And("kullanici adi olarak {string} girmeli")
    public void kullaniciAdiOlarakGirmeli(String username) {
        hmcPage.usernameTextBox.sendKeys(username);
    }

}

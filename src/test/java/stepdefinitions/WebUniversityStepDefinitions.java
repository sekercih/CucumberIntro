package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityStepDefinitions {
WebUniversityPage univ=new WebUniversityPage();

    @Given("Login Porta' a kadar asagi iner")
    public void login_porta_a_kadar_asagi_iner() {
        ReusableMethods.hover(univ.webUniversityLoginPortal);

    }
    @Given("Login Portala tiklar")
    public void login_portala_tiklar() {
       univ.webUniversityLoginPortal.click();
    }
    @Given("Diger window'a gecin")
    public void diger_window_a_gecin() {
      ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }
    @Then("{string} ve {string} kutularina deger yazar")
    public void ve_kutularina_deger_yazar(String userName, String passWord) {
        univ.webUniversityUserNameButton.sendKeys(userName);
        univ.webUniversityPasswordButton.sendKeys(passWord);

    }
    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {
        univ.webUniversityButton.click();
    }
    @Then("Popup'ta cikan yazinin {string} oldugunu test edin")
    public void popup_ta_cikan_yazinin_oldugunu_test_edin(String alert) {
       String pop= Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(pop,alert);
    }
    @Then("Ok diyerek Popup'i kapatin")
    public void ok_diyerek_popup_i_kapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("Ilk sayfaya geri donun")
    public void ilk_sayfaya_geri_donun() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }
    @Then("Ilk sayfaya donuldugunu test edin")
    public void ilk_sayfaya_donuldugunu_test_edin() {
      String actualTitle=Driver.getDriver().getTitle();
      String expectedTitle="WebDriverUniversity.com";
      Assert.assertEquals(expectedTitle,actualTitle);
    }


    @Then("biraz {int} saniye bekle")
    public void birazSaniyeBekle(int bekle) {
        ReusableMethods.waitFor(bekle);
    }
}

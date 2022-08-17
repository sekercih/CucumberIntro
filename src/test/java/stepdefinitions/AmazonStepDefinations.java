package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import org.junit.Assert;
import org.openqa.selenium.Keys;

public class AmazonStepDefinations {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazon sayfasına gider")
    public void kullanici_amazon_sayfasına_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("AmazonURL"));
    }
    @Given("iphone icin arama yapar")
    public void iphone_icin_arama_yapar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("sonuclarin iphone icerdiğini test eder")
    public void sonuclarin_iphone_icerdiğini_test_eder() {
        amazonPage.aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
    }
    @Given("teapot icin arama yapar")
    public void teapot_icin_arama_yapar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("sonuclarin tea pot icerdiğini test eder")
    public void sonuclarin_tea_pot_icerdiğini_test_eder() {
        String sonuc=amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonuc.contains("iphone"));
    }
    @Given("flower icin arama  yapar")
    public void flower_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("flower",Keys.ENTER);
    }
    @Then("sonuclarin  flower icerdigini  test eder.")
    public void sonuclarin_flower_icerdigini_test_eder() {
        String sonuc=amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonuc.contains("flower"));
    }
    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String istenenURL) {
        Driver.getDriver().get(ConfigurationReader.getProperty(istenenURL));
    }
    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);

    }
    @Then("sonuclarin {string} icerdiğini test eder")
    public void sonuclarin_icerdiğini_test_eder(String arananKelime) {
        String sonucYazisiStr=amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonucYazisiStr.contains(arananKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

}

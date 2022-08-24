package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.N11Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class N11StepDefinations {
    N11Page n11 = new N11Page();

    @When("kullanici ana sayfayi dogrular")
    public void kullanici_ana_sayfayi_dogrular() {
        n11.anapop.click();
        n11.dahaSonra.click();

        String n11Title = Driver.getDriver().getTitle();
        String actualTitle = "n11 - Hayat Sana Gelir";
        Assert.assertTrue(n11Title.contains(actualTitle));
    }

    @When("kullanici siteye giris yapar")
    public void kullanici_siteye_giris_yapar() {
        n11.giris.click();
    }

    @Then("{string} girer {string} girer")
    public void girer_girer(String email, String password) {
        n11.email.sendKeys(email);
        n11.passWord.sendKeys(password);
       ReusableMethods.waitFor(3);
        n11.loginClick.click();
    }

    @When("Login islemi kontrol edilir")
    public void login_islemi_kontrol_edilir() {
        String hesapisim = n11.hesapisim.getText();
        String hesap = "FC";
        Assert.assertEquals(hesapisim, hesap);
    }

    @Then("{string} kelimesi aranir")
    public void kelimesi_aranir(String string) {
        n11.aramakutusu.sendKeys(string);

    }

    @Then("İphone kelimesi aratildigi kontrol edilir")
    public void i̇phone_kelimesi_aratildigi_kontrol_edilir() {
        String arananKelime = "iphone";
        String sonucKelime = n11.arananSonuc.getText();
        Assert.assertTrue(arananKelime.contains(sonucKelime));

    }

    @Then("Arama sonucları sayfasından ikinci sayfaya gidilir")
    public void arama_sonucları_sayfasından_ikinci_sayfaya_gidilir() {
        ReusableMethods.hover(n11.ikinciSayfa);
        n11.ikinciSayfa.click();
    }

    @Then("ikinci sayfanin acildigi kontrol edilir")
    public void ikinci_sayfanin_acildigi_kontrol_edilir() {
      String actualTitle=Driver.getDriver().getTitle();
      String expectedTitle="Sayfa 2";
      Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("Sayfadaki ucuncu urun favorilere eklenir")
    public void sayfadaki_ucuncu_urun_favorilere_eklenir() {
    n11.favoriAl.click();
    }

    @Then("Hesabımdan istek favorilerim sayfasına gidilir")
    public void hesabımdan_istek_favorilerim_sayfasına_gidilir() {
     ReusableMethods.hover(n11.hesapisim);
     n11.favoriHesap.click();

    }

    @Then("Favoriler sayfasi acildigi kontrol edilir")
    public void favoriler_sayfasi_acildigi_kontrol_edilir() {
      Assert.assertTrue(n11.favoriDogrulama.isDisplayed());
    }

    @Then("Eklenen ürün favorilerden silinir ve silme işlemi kontrol edilir.")
    public void eklenen_ürün_favorilerden_silinir_ve_silme_işlemi_kontrol_edilir() {
      n11.favoriListesi.click();
      n11.favoriSil.click();
      Assert.assertTrue(n11.silmeMesaj.isDisplayed());
      n11.silMesajTamam.click();
    }

    @When("Üye çıkış işlemi yapılır.")
    public void üye_çıkış_işlemi_yapılır() {
        ReusableMethods.hover(n11.hesapisim);
        n11.cikisYap.click();
    }


}

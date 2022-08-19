package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepDefinitions {
EditorPage editorPage=new EditorPage();


    @Then("new butonuna basar")
    public void newButonunaBasar() {
        editorPage.newButonu.click();
    }

    @Then("firstname olarak {string} girer")
    public void firstnameOlarakGirer(String firstname) {
        editorPage.firstNameBox.sendKeys(firstname);
    }

    @Then("Lastname olarak {string} girer")
    public void lastnameOlarakGirer(String lastname) {
        editorPage.lastNameBox.sendKeys(lastname);
    }

    @Then("Position olarak {string} girer")
    public void positionOlarakGirer(String positi) {
        editorPage.possitionBox.sendKeys(positi);
    }

    @Then("Office olarak {string} girer")
    public void officeOlarakGirer(String office) {
        editorPage.officeBox.sendKeys(office);
    }

    @Then("Extension olarak {string} girer")
    public void extensionOlarakGirer(String extension) {
        editorPage.extensionBox.sendKeys(extension);
    }

    @Then("Start date olarak {string} girer")
    public void startDateOlarakGirer(String startDate) {
        editorPage.dateBox.sendKeys(startDate);
    }

    @Then("Salary olarak {string} girer")
    public void salaryOlarakGirer(String salary) {
        editorPage.salary.sendKeys(salary);
    }

    @And("kullanıcı Create tusuna basar")
    public void kullanıcıCreateTusunaBasar() {
        editorPage.createButonElement.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstnameArama) {
        editorPage.searchBoxElement.sendKeys(firstnameArama);
    }

    @And("isim bolumunde {string} dogrular")
    public void isimBolumundeDogrular(String firstSearch) {
        String sonuc=editorPage.aramasonucuElement.getText();
        Assert.assertTrue(sonuc.contains(firstSearch));
    }
    }

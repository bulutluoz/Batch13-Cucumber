package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }

    @Given("iPhone icin arama yapar")
    public void i_phone_icin_arama_yapar() {


        amazonPage.searchBox.sendKeys("iPhone"+ Keys.ENTER);

    }

    @Then("sonuclarin iPhone icerdigini test eder")
    public void sonuclarin_iPhone_icerdigini_test_eder() {

        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("iPhone"));

    }

    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {

        amazonPage.searchBox.sendKeys("tea pot"+ Keys.ENTER);

    }

    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarin_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("tea pot"));
    }

    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("flower"+ Keys.ENTER);
    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("flower"));
    }


    @Then("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @When("{string} icin arama yapar")
    public void icin_arama_yapar(String arananKelime) {
       amazonPage.searchBox.sendKeys(arananKelime + Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String arananKelime) {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains(arananKelime));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String sayfaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(sayfaUrl));
    }
    @Then("Today's deals sekmesine tiklar")
    public void today_s_deals_sekmesine_tiklar() {
        amazonPage.todaysDealsButonu.click();
    }
    @Then("Todays deals sayfasinda {string} icin arama yapar")
    public void todays_deals_sayfasinda_icin_arama_yapar(String aranacakKelime) {
        amazonPage.searchBox.sendKeys(aranacakKelime + Keys.ENTER);
    }
    @Then("ilk ilan isminde {string} gectigini test eder")
    public void ilk_ilan_isminde_gectigini_test_eder(String arananKelime) {
        Assert.assertTrue(amazonPage.aramaSonucuIlkUrunIsmiElementi.getText().contains(arananKelime));
    }
}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YandexPage;
import utilities.ConfigReader;
import utilities.Driver;

public class YandexStepDefinitions {
    YandexPage yandexPage=new YandexPage();

    @Given("Kullanici Yandex anasayfaya gider")
    public void kullanici_yandex_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("yandex_url"));
    }
    @When("Yandexde iPhone icin arama yapar")
    public void yandexde_i_phone_icin_arama_yapar() {
        yandexPage.AramaKutusu.sendKeys("iPhone" + Keys.ENTER);

    }
    @Then("Yandexde sonuclarin iPhone icerdigini test eder")
    public void yandexde_sonuclarin_i_phone_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }
    @When("Yandexde tea pot icin arama yapar")
    public void yandexde_tea_pot_icin_arama_yapar() {
        yandexPage.AramaKutusu.sendKeys("tea pot" + Keys.ENTER);
    }
    @Then("Yandexde sonuclarin tea pot icerdigini test eder")
    public void yandexde_sonuclarin_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tea pot"));
    }

}

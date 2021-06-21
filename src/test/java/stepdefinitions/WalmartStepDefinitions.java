package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class WalmartStepDefinitions {


    @Given("Kullanici Walmart anasayfaya gider")
    public void kullaniciWalmartAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("walmart_url"));
    }
}

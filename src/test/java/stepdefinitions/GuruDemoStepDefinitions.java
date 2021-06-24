package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.DemoGuruPage;
import utilities.ConfigReader;

public class GuruDemoStepDefinitions {

    DemoGuruPage demoGuruPage=new DemoGuruPage();

    @Given("kullanici Satir nosu {string} ve sutun nosu {string} olan hucredeki yaziyi yazdirir")
    public void kullanici_satir_nosu_ve_sutun_nosu_olan_hucredeki_yaziyi_yazdirir(String satirNo, String sutunNo) {

        int satirNumarasi= Integer.parseInt(ConfigReader.getProperty(satirNo));
        int sutunNumarasi=Integer.parseInt(ConfigReader.getProperty(sutunNo));


        System.out.println("istediginiz hucredeki yazi : " + demoGuruPage.istenenHucreBilgisiniDondur(satirNumarasi,sutunNumarasi));

    }
}

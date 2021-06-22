package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-raporlar.html"},
        // 1- bu notasyonun gorevi feature dosyalarim ile stepdefinition dosyalarini birlestirmek
        features="src/test/resources/features",
        glue="stepdefinitions",
        // boylece package'lari birbirine bagliyoruz
        // bu iki paket altinda kactane class olursa olsun,
        // herhangi bir class'da yazilan her adim diger class'lardaki adimlarla uyusursa yeni adim olusturmaya gerek kalmaz

        tags="@dip", // work in progress
        // 2-  @ testNG'degi group gibi calisir
        // eger sadece 1 Feature veya 1 Scenario calistiracaksak, gidip feature dosyasindan calistirabiliriz
        // birden fazla Feature veya Scenario calistirmak istedigimizde
        // calistiracagimiz F veya S 'lara ortak bir tag atamamiz ve bu tag'i
        // runner'da belirtmemiz gerekir
        // and dendiginde yazilan taglarin tamamina sahip olanlar calistirilir
        // or dedigimde yazilan taglardan herhangi birine veya daha fazlasina sahip olanlar calisir
        // eger tum test case'leri calistirmak isterseniz tag'i yorum haline getirmeniz yeterli olur

        dryRun=false
        // true oldugunda test case'leri calistirmayi denemeden sadece eksik olan step'leri bana verir
        // false oldugunda test case'leri calistirmayi dener eksik step' bulursa onu rapor eder

)
public class runner {

}

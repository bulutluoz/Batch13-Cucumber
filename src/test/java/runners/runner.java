package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // 1- bu notasyonun gorevi feature dosyalarim ile stepdefinition dosyalarini birlestirmek
        features="src/test/resources/features",
        glue="stepdefinitions",
        // boylece package'lari birbirine bagliyoruz
        // bu iki paket altinda kactane class olursa olsun,
        // herhangi bir class'da yazilan her adim diger class'lardaki adimlarla uyusursa yeni adim olusturmaya gerek kalmaz

        tags="@wip", // work in progress
        // 2-  @ testNG'degi group gibi calisir
        // eger sadece 1 Feature veya 1 Scenario calistiracaksak, gidip feature dosyasindan calistirabiliriz
        // birden fazla Feature veya Scenario calistirmak istedigimizde
        // calistiracagimiz F veya S 'lara ortak bir tag atamamiz ve bu tag'i
        // runner'da belirtmemiz gerekir

        dryRun=false
        // 3-
)


public class runner {

}

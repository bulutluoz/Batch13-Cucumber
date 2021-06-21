
Feature: US1003_Yandex Arama

  Background: Kullanici Yandex anasayfaya gider
    Given Kullanici Yandex anasayfaya gider

    Scenario: TC05_Iphone arama
      When Yandexde iPhone icin arama yapar
      Then Yandexde sonuclarin iPhone icerdigini test eder

    Scenario:TC06_tea pot arama
      When Yandexde tea pot icin arama yapar
      Then Yandexde sonuclarin tea pot icerdigini test eder
      And sayfayi kapatir

      # 1- feature dosyasi olusturup, insan olarak yapacagim adimlari yaziyorum
      # 2- Eksik step definition'lari elde etmek icin, testimizi calistiriyoruz
          # eger Feature dosyasindan calistirirsak calisan adimlari run eder ve eksik kalan adimlari bize verir
          # eger varolan adimlari calistirmadan direk eksik stepleri versin istiyorsak
          # runner'a gidip dryRun'i true yapariz, eksik stepleri aldiktan sonra yeniden false yapariz
      # 3- eksik step'leri kopyalayip, stepDefinition class'ina yapistiririz
      # 4- stepleri calistiracak Java kodlarimizi method'larin icine yazariz
      # 5- Locate ihtiyacimiz olursa page class'i olusturur, gerekli locate'leri yapariz
            # step definition class'inda birden fazla method'da page objesini kullanacagim icin
            # page objesini class level'da (instance) olustururum
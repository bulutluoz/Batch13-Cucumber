@wip
Feature: US1003_Walmart Arama

  Background: Kullanici Walmart anasayfaya gider
    Given Kullanici Walmart anasayfaya gider

    Scenario: TC05_Iphone arama
      When Walmartta iPhone icin arama yapar
      Then Walmartta sonuclarin iPhone icerdigini test eder

    Scenario:TC06_tea pot arama
      When Walmartta tea pot icin arama yapar
      Then Walmartta tea pot icerdigini test eder
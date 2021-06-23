Feature: US1011 Amazon Arama
  @rapor1


  Scenario: TC15_Kullanici Amazonda Mehmet aratir

    Given kullanici "amazon_url" sayfasina gider
    Then Today's deals sekmesine tiklar
    And Todays deals sayfasinda "Mehmet" icin arama yapar
    Then ilk ilan isminde "Mehmet" gectigini test eder

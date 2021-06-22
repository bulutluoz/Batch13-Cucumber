Feature: US101_Editor Data Table
  @dip
  Scenario: TC14_Data Table Test

    When kullanici "editor.datatables.net" sayfasina gider
    Then new butonuna basar
    And Tum bilgileri girer
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
    And sayfayi kapatir

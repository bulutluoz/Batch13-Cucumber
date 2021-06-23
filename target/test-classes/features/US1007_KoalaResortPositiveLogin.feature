Feature: US1007_Koala Resort Positive Login


  Scenario: TC11 kullanici gecerli bilgilerle giris yapar


    Given kullanici "kr_url" sayfasina gider
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir
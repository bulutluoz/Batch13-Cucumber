Feature: US_Farkli Url Calistirma

  @rapor2
  Scenario Outline:

    Given kullanici "<sayfaUrl>" sayfasina gider

  Examples:
    |sayfaUrl|
    |amazon_url|
    |yandex_url|
    |facebook_url|
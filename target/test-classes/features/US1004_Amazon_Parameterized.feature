@wip
Feature: US1004_Amazon Parameterized

  Background: Amazon sayfasina git
    Given kullanici amazon sayfasina gider

    Scenario: TC07_Amazon iPhone arama parametreli
      When "nutella" icin arama yapar
      Then sonuclarin "nutella" icerdigini test eder
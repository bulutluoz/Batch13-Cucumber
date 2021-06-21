Feature: US1005_Amazon Scenario Outline
  Scenario Outline: TC10_Amazon Coklu Arama

    Given kullanici amazon sayfasina gider
    Then "<Meyve>" icin arama yapar
    And sonuclarin "<Meyve>" icerdigini test eder


    Examples:
    |Meyve|
    |armut|
    |kavun|
    |karpuz|
    |kiraz |
    |visne |
    |erik  |
    |avakado|


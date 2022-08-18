@lenova
Feature:US106_amazon_seach

  Background: amazon search test
    Given kullanici amazon sayfasına gider

    Scenario: TC07_ Lenova Testi
    When "lenova" icin arama yapar
    Then sonuclarin "lenova" icerdiğini test eder
      Given sayfayi kapatir


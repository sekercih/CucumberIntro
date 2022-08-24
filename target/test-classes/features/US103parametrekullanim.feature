@parametre @paralel1
Feature: Parametreli stepdefination olusturma


  Scenario: TC04_parametre kullanımı
Given kullanici amazon sayfasına gider
    And "macbook" icin arama yapar
    Then sonuclarin "macbook1" icerdiğini test eder
    And sayfayi kapatir
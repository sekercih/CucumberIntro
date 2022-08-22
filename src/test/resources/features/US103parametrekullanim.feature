Feature: Parametreli stepdefination olusturma
@parametre @paralel1
  Scenario: TC04_parametre kullanımı
Given kullanici amazon sayfasına gider
    And "macbook" icin arama yapar
    Then sonuclarin "windows" icerdiğini test eder
    And sayfayi kapatir
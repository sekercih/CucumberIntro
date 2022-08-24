@testparalel1
Feature: US107 Senario Outline ile amazon testleri

  Scenario Outline: TC10 amazonda bir listenin tüm elementlerini aratmak
    Given kullanici "AmazonURL" sayfasina gider
    Then "<aranacakEleman>" icin arama yapar
    And sonuclarin "<aranacakEleman>" icerdiğini test eder
    Then sayfayi kapatir



    Examples:
      |aranacakEleman|
      |car|
      |water|
      |Usb|
      |glass|
      |t-shirts|





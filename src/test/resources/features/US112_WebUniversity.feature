@Webu @testparalel2
Feature: US112 WebUniversity Window Handle

  Scenario Outline: TC17 Reusuble Methots ile window handle
  
  Given kullanici "WebUniversityUrl" sayfasina gider
  And Login Porta' a kadar asagi iner
  And Login Portala tiklar
  And Diger window'a gecin
  Then "<usurname>" ve "<password>" kutularina deger yazar
  And WebUniversity Login butonuna basar
  And Popup'ta cikan yazinin "validation failed" oldugunu test edin
  Then Ok diyerek Popup'i kapatin
  And Ilk sayfaya geri donun
  And Ilk sayfaya donuldugunu test edin
    Then biraz 3 saniye bekle
  And sayfayi kapatir
    Examples:
      | usurname | password |
      | Bilal | SAFAK |



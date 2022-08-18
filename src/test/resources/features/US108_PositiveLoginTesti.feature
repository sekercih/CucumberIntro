Feature: US108 Pozitif login test
@hotel
  Scenario: TC11 Pozitive login

    Given kullanici "HMCUrl" sayfasina gider
     Then login linkine tiklar
    Then kullanici adi olarak "HMCValidUsername" girer
    Then password olarak "HMCValidPassword" girer
    Then login butonuna basar
    When basarili olarak giris yaptigini test eder
      And sayfayi kapatir

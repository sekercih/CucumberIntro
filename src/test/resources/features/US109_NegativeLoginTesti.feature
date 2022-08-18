@negative
Feature: US109 Negative Login Test

  Scenario: TC12 yanlis username, dogru password ile giris yap

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    Then kullanici adi olarak "HMCWrongUsername" girer
    Then  password olarak "HMCValidPassword" girer
    When login butonuna basar
    And giris yapilamadigini test eder
    And sayfayi kapatir

    Scenario: TC13 dogru username yanlis password

      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tiklar
      Then kullanici adi olarak "HMCValidUsername" girer
      Then  password olarak "HMCWrongPassword" girer
      When login butonuna basar
      And giris yapilamadigini test eder
      And sayfayi kapatir

      Scenario: TC14 yanlis username, yanlis password
        Given kullanici "HMCUrl" sayfasina gider
        Then login linkine tiklar
        Then kullanici adi olarak "HMCWrongUsername" girer
        Then  password olarak "HMCWrongPassword" girer
        When login butonuna basar
        And giris yapilamadigini test eder
        And sayfayi kapatir
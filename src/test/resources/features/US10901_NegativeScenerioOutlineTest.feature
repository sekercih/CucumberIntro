@negativeOutline
Feature: US10901_Negative Scenario Outline Test
  
  Scenario Outline: TC15 farkli kullanici adi ve parola 
  Given kullanici "HMCUrl" sayfasina gider
  Then login linkine tiklar
  And kullanici adi olarak "<username>" girmeli
     And password olarak "<password>" girmeli
       And login butonuna basar
  When giris yapilamadigini test eder
  Then sayfayi kapatir

    Examples:
      | username | password |
      | manager34 | pass123 |
      | manager | manager88 |
      | manager2 | Manager1! |


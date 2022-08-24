@Editor @testparalel1
Feature: US110 Scenario Outline ile editör database sayfasina kayit


  Scenario Outline: TC16 kullanici yeni kayit eklemeli

    When kullanici "EDB" sayfasina gider
    Then new butonuna basar
    Then firstname olarak "<firstname>" girer
    Then Lastname olarak "<Lastname>" girer
    Then Position olarak "<position>" girer
    Then Office olarak "<office>" girer
    Then Extension olarak "<extension>" girer
    Then Start date olarak "<startdate>" girer
    Then Salary olarak "<salary>" girer
    And kullanıcı Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    And isim bolumunde "<firstname>" dogrular
    And sayfayi kapatir

    Examples:
      | firstname | Lastname | position | office | extension | startdate | salary |
      | Alkan | Tuncer | DevOps | NC | QA | 2022-10-10 | 110000 |
      | Muhammed | güney | Developer | Almanya | Boss | 2022-10-11 | 55500 |
      | Sadri | Findikli | Developer | İngiltere | QA | 2022-10-12 | 45000 |
      | Hasan | Ozye | Tester | Dubai | QA | 2022-10-15 | 150000 |



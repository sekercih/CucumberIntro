@amazontum @paralel2 @paralel8 @paralel5 @paralel3
Feature: US102 Backgroun ile amazon search testi

  Background: amazon sayfasina gider
    Given kullanici amazon sayfasına gider
#Background BefoforeMethod görevi görür
  @amazonspace
  Scenario: TC01_Amazon İphone search Testi
    And iphone icin arama yapar
    Then sonuclarin iphone icerdiğini test eder

@amazoncorona
  Scenario: TC02_Amazon tea pot Search Testi
    And teapot icin arama yapar
    Then sonuclarin tea pot icerdiğini test eder

  @amazonspace
  Scenario: TC03_Amazon flower Search Testi
    And flower icin arama  yapar
    Then sonuclarin  flower icerdigini  test eder.


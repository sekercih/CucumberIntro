Feature: US101_amazon_search

  Scenario: TC01_Amazon Search Test
    Given kullanici amazon sayfasına gider
    And iphone icin arama yapar
    Then sonuclarin iphone icerdiğini test eder

    Given kullanici amazon sayfasına gider
    And teapot icin arama yapar
    Then sonuclarin tea pot icerdiğini test eder

    Given kullanici amazon sayfasına gider
    And flower icin arama  yapar
    Then sonuclarin  flower icerdigini  test eder.






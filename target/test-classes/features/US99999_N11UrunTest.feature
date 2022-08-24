@n11
Feature:N11 Product Test
  Scenario Outline: N11 Sitesine Gidip Favori Urun Ekleyip Silmek
    Given kullanici "url" sayfasina gider
      When kullanici ana sayfayi dogrular
    When kullanici siteye giris yapar
    Then "<email>" girer "<password>" girer
    When Login islemi kontrol edilir
    Then "iphone" kelimesi aranir
    Then İphone kelimesi aratildigi kontrol edilir
    Then Arama sonucları sayfasından ikinci sayfaya gidilir
    Then ikinci sayfanin acildigi kontrol edilir
    When Sayfadaki ucuncu urun favorilere eklenir
    Then Hesabımdan istek favorilerim sayfasına gidilir
    Then Favoriler sayfasi acildigi kontrol edilir
    Then Eklenen ürün favorilerden silinir ve silme işlemi kontrol edilir.
    When Üye çıkış işlemi yapılır.
    Examples:
      | email | password |
      | ferhat142yedek@hotmail.com | Yede124k+ |





 # www.n11.com sitesi açılır.
  #Ana sayfanın açıldığı kontrol edilir.
  #Siteye login olunur.
  #Login işlemi kontrol edilir.
 # Iphone kelimesi aranır.
  #Iphone kelimesi aratıldığı kontrol edilir.
  #Arama sonuçları sayfasından 2. sayfa açılır.
 # 2. sayfanın açıldığı kontrol edilir.
 # Sayfadaki 3. ürün favorilere eklenir.
 # Hesabım -> İstek Listem / Favorilerim sayfasına gidilir.
 # “Favorilerim” sayfası açıldığı kontrol edilir.
 # Eklenen ürün favorilerden silinir ve silme işlemi kontrol edilir.
 # Üye çıkış işlemi yapılır.
 # Üstteki senaryo gerçekleşmeli. Raporlama yapılmalı sayfalar arası geçişte ve validasyon esnasında ekran görüntüsü alınmalı (rapor içerisine eklenmeli). Github üzerinden paylaşılmalı. Proje içerisine bir adet readme dosyası eklenmeli ve nasıl çalıştırılacağı yazılmalıdır.


Feature:Trendyol otomasyon testi


  @test
  Scenario:Kullanıcı siteye login olabilmeli
    Given Kullanıcı trendyol anasayfasında.
    When  Erkek Kategorisi seçilir
    And   Arama motoruna tıklanır ve "kulaklık" yazılır
    And   Arama motoru temizlenir
    And   Arama motoruna tıklanır ve "kalem" yazılır
    And   Arama motoru temizlenir
    And   Arama motoruna excelden herhangi bir kelime seçilip yazılır
    And   Arama motorunda search için search ikonuna tıklanır
    And   Pop-up kapatılması için herhangi bir yere tıklanır yoksa devam edilir
    And   Listelenen ürünlerden ilk sıradaki ürün seçilir
    And   Açılan yeni sekmeye geçilir
    And   Seçilen ürün Sepete eklenir
    And   Sepetim sekmesine tıklar ve Sepete gider
    Then  Ürün sepetten silinir



  Scenario: Login case
    Given Kullanıcı trendyol anasayfasında.
    When  Erkek Kategorisi seçilir
    And   Giriş yap butonuna tıklanır
    And   Üye ol tabı seçilir
    And   Eposta ve şifre belirlenir, Aydınlatma metni kabul edilir ve üye ol butonuna tıklanır
    And   Eposta doğrulama ekranının geldiği doğrulanır ve popup kapatılır
    And   Giriş yap tabı seçilir
    And   Doğrulanmış eposta ve mail girilir ve giriş yap butonuna basılır.
    And   Arama motoruna tıklanır ve "kulaklık" yazılır
    And   Arama motoru temizlenir
    And   Arama motoruna tıklanır ve "kalem" yazılır
    And   Arama motoru temizlenir
    And   Arama motoruna excelden herhangi bir kelime seçilip yazılır
    And   Arama motorunda search için search ikonuna tıklanır
    And   Pop-up kapatılması için herhangi bir yere tıklanır yoksa devam edilir
    And   Listelenen ürünlerden ilk sıradaki ürün seçilir
    And   Açılan yeni sekmeye geçilir
    And   Seçilen ürün Sepete eklenir
    And   Sepetim sekmesine tıklar ve Sepete gider
    Then  Ürün sepetten silinir







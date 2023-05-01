package trendyol.stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

import trendyol.pages.*;
import trendyol.utilities.ConfigurationReader;
import trendyol.utilities.Driver;
import trendyol.utilities.Excelutilities;

import java.util.Random;
import java.util.Set;


public class MyStepdefs {

    Anasayfa anasayfa = new Anasayfa();
    Sepetim sepetim = new Sepetim();
    AramaMotoru aramamotoru = new AramaMotoru();
    GirisYapSayfası girisYapSayfası = new GirisYapSayfası();
    UrunSayfası urunSayfası = new UrunSayfası();
    UrunDetaySayfası urunDetaySayfası = new UrunDetaySayfası();
    Excelutilities excelUtil = new Excelutilities("kelimeler.xlsx","Sheet1");


    @Given("Kullanıcı trendyol anasayfasında.")
    public void kullanıcıTrendyolAnasayfasında() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("Erkek Kategorisi seçilir")
    public void erkekKategorisiSeçilir() {
        anasayfa.erkekButonu.click();
    }

    @And("Arama motoru temizlenir")
    public void aramaMotoruTemizlenir() {
        aramamotoru.AramaMotoru.clear();
    }

    @And("Arama motoruna tıklanır ve {string} yazılır")
    public void aramaMotorunaTıklanırVeYazılır(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        aramamotoru.AramaMotoru.click();
        aramamotoru.AramaMotoru.sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("Arama motorunda search için search ikonuna tıklanır")
    public void aramaMotorundaSearchIçinSearchIkonunaTıklanır() {
        aramamotoru.SearchIconu.click();
    }

    @And("Pop-up kapatılması için herhangi bir yere tıklanır yoksa devam edilir")
    public void popUpKapatılmasıIçinHerhangiBirYereTıklanır() {
        try
        {
            urunSayfası.Overlay.click();
        }
        catch(NoSuchElementException e)
        {
            System.out.println("popup bulunamadı");
        }

    }


    @And("Listelenen ürünlerden ilk sıradaki ürün seçilir")
    public void listelenenÜrünlerdenIlkSıradakiÜrünSeçilir() throws InterruptedException {
        urunSayfası.SecilecekUrün.click();

    }


    @And("Seçilen ürün Sepete eklenir")
    public void seçilenÜrünSepeteEklenir() throws InterruptedException {
        Thread.sleep(2000);
        urunDetaySayfası.SepeteEkle.click();
    }

    @And("Sepetim sekmesine tıklar ve Sepete gider")
    public void sepetimSekmesineTıklarVeSepeteGider() {
        sepetim.Sepetim.click();
    }

    @Then("Ürün sepetten silinir")
    public void ürünSepettenSilinir() {
        sepetim.ÜrünSilme.click();
    }


    @And("Açılan yeni sekmeye geçilir")
    public void açılanYeniSekmeyeGeçilir() {

        String parentWindow = Driver.getDriver().getWindowHandle();
        Set<String> handles =  Driver.getDriver().getWindowHandles();
        for(String windowHandle  : handles)
        {
            if(!windowHandle.equals(parentWindow))
            {
                Driver.getDriver().switchTo().window(windowHandle);

               // Driver.getDriver().close(); //closing child window
               // Driver.getDriver().switchTo().window(parentWindow); //cntrl to parent window
            }
        }

     
    }

    @And("Giriş yap butonuna tıklanır")
    public void girişYapButonunaTıklanır() {
        anasayfa.girisYapButonu.click();
    }

    @And("Üye ol tabı seçilir")
    public void üyeOlTabıSeçilir() {
        girisYapSayfası.uyeolTabi.click();
    }

    @And("Eposta ve şifre belirlenir, Aydınlatma metni kabul edilir ve üye ol butonuna tıklanır")
    public void epostaVeŞifreBelirlenirAydınlatmaMetniKabulEdilirVeÜyeOlButonunaTıklanır() throws InterruptedException {

        Faker faker = new Faker();
        String randomEmail = faker.internet().emailAddress();

        girisYapSayfası.eposta.sendKeys(randomEmail);

        girisYapSayfası.password.sendKeys("oguzhan123.");

        girisYapSayfası.aydinlatmametni.click();

        Thread.sleep(1000);

        girisYapSayfası.aydinlatmametniClose.click();

        girisYapSayfası.uyeolButonu.click();

    }

    @And("Arama motoruna excelden herhangi bir kelime seçilip yazılır")
    public void aramaMotorunaExceldenHerhangiBirKelimeSeçilipYazılır() throws InterruptedException {
        Random r=new Random(); //random sınıfı
        String word = excelUtil.getCellData(r.nextInt(2),r.nextInt(2));
        aramamotoru.AramaMotoru.click();
        aramamotoru.AramaMotoru.sendKeys(word);
        Thread.sleep(1000);


    }

    @And("Eposta doğrulama ekranının geldiği doğrulanır ve popup kapatılır")
    public void epostaDoğrulamaEkranınınGeldiğiDoğrulanırVePopupKapatılır() throws InterruptedException {

        Thread.sleep(1000);
        String epostaPopup = "E-POSTA DOĞRULAMA";
        String epostaDogrulamaPopupText = girisYapSayfası.epostaDogrulamaPopup.getText();
        Assert.assertEquals(epostaPopup, epostaDogrulamaPopupText);
        girisYapSayfası.epostaDogrulamaPopupClose.click();

    }


    @And("Giriş yap tabı seçilir")
    public void girişYapTabıSeçilir() {
        girisYapSayfası.girisYapTabi.click();
    }
}

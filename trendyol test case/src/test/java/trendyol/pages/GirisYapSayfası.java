package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class GirisYapSayfası {

    public GirisYapSayfası(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='q-secondary q-button-medium q-button tab button right ']")
    public WebElement uyeolTabi;

    @FindBy(id = "register-email")
    public WebElement eposta;

    @FindBy(id = "register-password-input")
    public WebElement password;

    @FindBy(xpath = "//span[@class='special-text']")
    public WebElement aydinlatmametni;

    @FindBy(xpath = "//i[@class='q-icon q-popup-icon-position i-close']")
    public WebElement aydinlatmametniClose;

    @FindBy(xpath = "//button[@data-testid='submit-button']")
    public WebElement uyeolButonu;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement epostaDogrulamaPopup;

    @FindBy(xpath = "//*[name()='svg' and @class= 'ty-cross']")
    public WebElement epostaDogrulamaPopupClose;

    @FindBy(xpath = "//button[@class= 'q-secondary q-button-medium q-button tab button mr-5 left ']")
    public WebElement girisYapTabi;




}

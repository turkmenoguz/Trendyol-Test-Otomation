package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class Anasayfa {

    public Anasayfa(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[@class='homepage-popup-img'])[2]")
    public WebElement erkekButonu;

    @FindBy(xpath = "//div[@class='link account-user']")
    public WebElement girisYapButonu;


}

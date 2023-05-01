package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class UrunSayfası {
    public UrunSayfası(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//div[@class='overlay']" )
    public WebElement Overlay;

    @FindBy(xpath ="(//div[@class='image-container'])[1]" )
    public WebElement SecilecekUrün;


}

package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class Sepetim {
    public Sepetim(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='i-trash']")
    public WebElement ÜrünSilme;

    @FindBy(xpath = "//a[@class='link account-basket']")
    public WebElement Sepetim;

}

package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class AramaMotoru {
    public AramaMotoru(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement AramaMotoru;

    @FindBy(xpath = "//i[@data-testid='search-icon']")
    public WebElement SearchIconu;


}

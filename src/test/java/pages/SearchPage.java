package pages;


import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.work.ua/")
public class SearchPage extends workuaPageObject {
    @FindBy(id = "search")
    public WebElement SearchBlock;

    @FindBy(xpath = "//input[@class='js-main-region form-control']")
    public  WebElement CityBox;

    @FindBy(xpath = "(//a[@href='javascript:void(0)']//span)[3]")
    public WebElement CityBoxClear;

    @FindBy(id = "sm-but")
    public WebElement searchButton;


}
